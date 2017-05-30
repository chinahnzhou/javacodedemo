/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.method.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Handles method return values by delegating to a list of registered {@link HandlerMethodReturnValueHandler}s.
 * Previously resolved return types are cached for faster lookups.
 *
 * @author Rossen Stoyanchev
 * @since 3.1
 */
public class HandlerMethodReturnValueHandlerComposite implements AsyncHandlerMethodReturnValueHandler {

	protected final Log logger = LogFactory.getLog(getClass());

	private final List<HandlerMethodReturnValueHandler> returnValueHandlers =
		new ArrayList<HandlerMethodReturnValueHandler>();


	/**
	 * Return a read-only list with the registered handlers, or an empty list.
	 */
	public List<HandlerMethodReturnValueHandler> getHandlers() {
		return Collections.unmodifiableList(this.returnValueHandlers);
	}

	/**
	 * Whether the given {@linkplain MethodParameter method return type} is supported by any registered
	 * {@link HandlerMethodReturnValueHandler}.
	 */
	@Override
	public boolean supportsReturnType(MethodParameter returnType) {
		return getReturnValueHandler(returnType) != null;
	}

	private HandlerMethodReturnValueHandler getReturnValueHandler(MethodParameter returnType) {
		for (HandlerMethodReturnValueHandler handler : this.returnValueHandlers) {
			if (handler.supportsReturnType(returnType)) {
				return handler;
			}
		}
		return null;
	}

	/**
	 * Iterate over registered {@link HandlerMethodReturnValueHandler}s and invoke the one that supports it.
	 * @throws IllegalStateException if no suitable {@link HandlerMethodReturnValueHandler} is found.
	 */
	@Override
	public void handleReturnValue(Object returnValue, MethodParameter returnType,
			ModelAndViewContainer mavContainer, NativeWebRequest webRequest) throws Exception {

		HandlerMethodReturnValueHandler handler = selectHandler(returnValue, returnType); // !!! 选择一个返回值处理器
		if (handler == null) {
			throw new IllegalArgumentException("Unknown return value type: " + returnType.getParameterType().getName());
		}
		handler.handleReturnValue(returnValue, returnType, mavContainer, webRequest); // 处理返回值
	}

	private HandlerMethodReturnValueHandler selectHandler(Object value, MethodParameter returnType) {
		boolean isAsyncValue = isAsyncReturnValue(value, returnType);
		/*
		 	  返回值处理器
		 	  
		 	  // Single-purpose return value types
                handlers.add(new ModelAndViewMethodReturnValueHandler());
                handlers.add(new ModelMethodProcessor());
                handlers.add(new ViewMethodReturnValueHandler());
                handlers.add(new ResponseBodyEmitterReturnValueHandler(getMessageConverters()));
                handlers.add(new StreamingResponseBodyReturnValueHandler());
                handlers.add(new HttpEntityMethodProcessor(getMessageConverters(),
                                this.contentNegotiationManager, this.requestResponseBodyAdvice));
                handlers.add(new HttpHeadersReturnValueHandler());
                handlers.add(new CallableMethodReturnValueHandler());
                handlers.add(new DeferredResultMethodReturnValueHandler());
                handlers.add(new AsyncTaskMethodReturnValueHandler(this.beanFactory));

                // Annotation-based return value types
                handlers.add(new ModelAttributeMethodProcessor(false));
                handlers.add(new RequestResponseBodyMethodProcessor(getMessageConverters(),
                                this.contentNegotiationManager, this.requestResponseBodyAdvice));

                // Multi-purpose return value types
                handlers.add(new ViewNameMethodReturnValueHandler());
                handlers.add(new MapMethodProcessor());

                // Custom return value types
                if (getCustomReturnValueHandlers() != null) {
                        handlers.addAll(getCustomReturnValueHandlers());
                }

                // Catch-all
                if (!CollectionUtils.isEmpty(getModelAndViewResolvers())) {
                        handlers.add(new ModelAndViewResolverMethodReturnValueHandler(getModelAndViewResolvers()));
                }
                else {
                        handlers.add(new ModelAttributeMethodProcessor(true));
                }
		 */
		for (HandlerMethodReturnValueHandler handler : this.returnValueHandlers) {
			if (isAsyncValue && !(handler instanceof AsyncHandlerMethodReturnValueHandler)) {
				continue;
			}
			if (handler.supportsReturnType(returnType)) {
				return handler;
			}
		}
		return null;
	}

	@Override
	public boolean isAsyncReturnValue(Object value, MethodParameter returnType) {
		for (HandlerMethodReturnValueHandler handler : this.returnValueHandlers) {
			if (handler instanceof AsyncHandlerMethodReturnValueHandler) {
				if (((AsyncHandlerMethodReturnValueHandler) handler).isAsyncReturnValue(value, returnType)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Add the given {@link HandlerMethodReturnValueHandler}.
	 */
	public HandlerMethodReturnValueHandlerComposite addHandler(HandlerMethodReturnValueHandler handler) {
		this.returnValueHandlers.add(handler);
		return this;
	}

	/**
	 * Add the given {@link HandlerMethodReturnValueHandler}s.
	 */
	public HandlerMethodReturnValueHandlerComposite addHandlers(List<? extends HandlerMethodReturnValueHandler> handlers) {
		if (handlers != null) {
			for (HandlerMethodReturnValueHandler handler : handlers) {
				this.returnValueHandlers.add(handler);
			}
		}
		return this;
	}

}
