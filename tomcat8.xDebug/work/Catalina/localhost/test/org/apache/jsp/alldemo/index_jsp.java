/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/@VERSION@
 * Generated at: 2017-04-15 17:42:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.alldemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "i am '/test/jsp/index.jsp'";
  }


// 
static {
	System.out.println("static block...\n");
}
// declaration method1
public void method1(){
	System.out.println("method1 Declarations1...\n");
}


// declaration method2
public String method2(){
	 return "method2...\n";
}
//declaration method3
public static void method3(){
	 System.out.println("method3 Declarations...\n");
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/taglib/janchou-taglib.tld", Long.valueOf(1472066285445L));
    _jspx_dependants.put("/WEB-INF/jsp/common/header.jsp", Long.valueOf(1492278118637L));
    _jspx_dependants.put("/WEB-INF/jsp/common/banner.jsp", Long.valueOf(1492278102821L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintStream");
    _jspx_imports_classes.add("javax.servlet.jsp.JspWriter");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.io.IOException");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmyprefix_005fecho_0026_005fstr_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005ftimeZone_005fformat_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fmyprefix_005fecho_0026_005fstr_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005ftimeZone_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fmyprefix_005fecho_0026_005fstr_005fnobody.release();
    _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005ftimeZone_005fformat_005fnobody.release();
    _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- 注释 bof -->\r\n");
      out.write("<!-- 注释 eof -->\r\n");
 out.write("Hello World test JSP ..."); 
      out.write("<br />\r\n");
      out.write("<!-- 指令 bof -->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- 静态引入 -->\r\n");
 out.write("this is header <br />"); 
      out.write("<br />\r\n");
 out.write("this is banner <br />"); 
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- 指令 eof -->\r\n");
      out.write(" \r\n");
      out.write("<!-- 声明代码块 bof-->\r\n");
      out.write("<!-- 声明代码块 eof-->\r\n");
      out.write(" \r\n");
      out.write("<!-- 表达式  bof-->\r\n");
      out.print(request.getAttribute("username")  );
      out.write("<br />\r\n");
      out.print(this.method2()  );
      out.write("<br />\r\n");
      out.print("hello world"  );
      out.write("<br />\r\n");
      out.print("hello world");
      out.write("<!-- 表达式  eof-->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- 脚本  bof-->\r\n");
 out.write("i am scriptlet ...");  
      out.write("<br />\r\n");
out.write("i am scriptlet ...");
      out.write("<!-- 脚本  eof-->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- 文本标签  bof--> \r\n");
      out.write("jsp:text...<!-- 文本标签  eof-->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- EL表达式 $ { } bof-->\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageScope.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationScope.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${header[\"User-Agent\"]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userCountry}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.method}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br />\r\n");
      out.write(" \r\n");
      out.write("<!-- EL表达式 $ { }  eof-->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- EL表达式 # { } bof-->\r\n");
      out.write("\r\n");
      out.write("<!-- EL表达式 # { }  eof-->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- 行为  bof-->\r\n");
      out.write("org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, \"/WEB-INF/jsp/common/menu.jsp\" + \"?\" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(\"param1\", request.getCharacterEncoding())+ \"=\" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(\"value1\", request.getCharacterEncoding()), out, true);\r\n");
      out.write("<br />\r\n");
      out.write("<!-- 动态引入行为 -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/common/menu.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("param1", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("value1", request.getCharacterEncoding()), out, false);
      out.write("<br />\r\n");
      out.write("<!-- 跳转行为 -->\r\n");
 if(request.getParameter("forword_param1")==null){ 
      if (true) {
        _jspx_page_context.forward("/jsp/index.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("forword_param1", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("forword_param1_value", request.getCharacterEncoding()));
        return;
      }
 }else{ 
      out.print(request.getParameter("forword_param1") );
 } 
      out.write("<!-- 行为  eof-->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("<!-- 自定义标签  bof-->\r\n");
      if (_jspx_meth_myprefix_005fecho_005f0(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      if (_jspx_meth_myprefix_005fdate_005f0(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      if (_jspx_meth_myprefix_005fdate_005f1(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      if (_jspx_meth_myprefix_005fdate_005f2(_jspx_page_context))
        return;
      out.write("<br />\r\n");
      out.write("<!-- 自定义标签  eof-->\r\n");
      out.write("<br /><br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_myprefix_005fecho_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  myprefix:echo
    cn.java.demo.tag.EchoTag _jspx_th_myprefix_005fecho_005f0 = (cn.java.demo.tag.EchoTag) _005fjspx_005ftagPool_005fmyprefix_005fecho_0026_005fstr_005fnobody.get(cn.java.demo.tag.EchoTag.class);
    _jspx_th_myprefix_005fecho_005f0.setPageContext(_jspx_page_context);
    _jspx_th_myprefix_005fecho_005f0.setParent(null);
    // /alldemo/index.jsp(103,0) name = str type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fecho_005f0.setStr("hello tag...");
    int _jspx_eval_myprefix_005fecho_005f0 = _jspx_th_myprefix_005fecho_005f0.doStartTag();
    if (_jspx_th_myprefix_005fecho_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmyprefix_005fecho_0026_005fstr_005fnobody.reuse(_jspx_th_myprefix_005fecho_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmyprefix_005fecho_0026_005fstr_005fnobody.reuse(_jspx_th_myprefix_005fecho_005f0);
    return false;
  }

  private boolean _jspx_meth_myprefix_005fdate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  myprefix:date
    cn.java.demo.tag.DateTag _jspx_th_myprefix_005fdate_005f0 = (cn.java.demo.tag.DateTag) _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005ftimeZone_005fformat_005fnobody.get(cn.java.demo.tag.DateTag.class);
    _jspx_th_myprefix_005fdate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_myprefix_005fdate_005f0.setParent(null);
    // /alldemo/index.jsp(104,0) name = timestamp type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fdate_005f0.setTimestamp(1472065970l);
    // /alldemo/index.jsp(104,0) name = format type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fdate_005f0.setFormat("yyyy-MM-dd HH:mm:ss");
    // /alldemo/index.jsp(104,0) name = timeZone type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fdate_005f0.setTimeZone("PRC");
    int _jspx_eval_myprefix_005fdate_005f0 = _jspx_th_myprefix_005fdate_005f0.doStartTag();
    if (_jspx_th_myprefix_005fdate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005ftimeZone_005fformat_005fnobody.reuse(_jspx_th_myprefix_005fdate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005ftimeZone_005fformat_005fnobody.reuse(_jspx_th_myprefix_005fdate_005f0);
    return false;
  }

  private boolean _jspx_meth_myprefix_005fdate_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  myprefix:date
    cn.java.demo.tag.DateTag _jspx_th_myprefix_005fdate_005f1 = (cn.java.demo.tag.DateTag) _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody.get(cn.java.demo.tag.DateTag.class);
    _jspx_th_myprefix_005fdate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_myprefix_005fdate_005f1.setParent(null);
    // /alldemo/index.jsp(105,0) name = timestamp type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fdate_005f1.setTimestamp(1472065970l);
    // /alldemo/index.jsp(105,0) name = format type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fdate_005f1.setFormat("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_myprefix_005fdate_005f1 = _jspx_th_myprefix_005fdate_005f1.doStartTag();
    if (_jspx_th_myprefix_005fdate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody.reuse(_jspx_th_myprefix_005fdate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody.reuse(_jspx_th_myprefix_005fdate_005f1);
    return false;
  }

  private boolean _jspx_meth_myprefix_005fdate_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  myprefix:date
    cn.java.demo.tag.DateTag _jspx_th_myprefix_005fdate_005f2 = (cn.java.demo.tag.DateTag) _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody.get(cn.java.demo.tag.DateTag.class);
    _jspx_th_myprefix_005fdate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_myprefix_005fdate_005f2.setParent(null);
    // /alldemo/index.jsp(106,0) name = timestamp type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fdate_005f2.setTimestamp(1472065970l);
    // /alldemo/index.jsp(106,0) name = format type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_myprefix_005fdate_005f2.setFormat("yyyy-MM-dd");
    int _jspx_eval_myprefix_005fdate_005f2 = _jspx_th_myprefix_005fdate_005f2.doStartTag();
    if (_jspx_th_myprefix_005fdate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody.reuse(_jspx_th_myprefix_005fdate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fmyprefix_005fdate_0026_005ftimestamp_005fformat_005fnobody.reuse(_jspx_th_myprefix_005fdate_005f2);
    return false;
  }
}
