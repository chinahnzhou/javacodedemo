package cn.java.note.收集的代码;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {
	public static void main(String[] args) {
		LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<Object>();
		int queueSize = queue.size();
		final int maxDrain = 128;
        List<Object> eventList = new ArrayList<Object>(maxDrain);
        while (true) {
            int numDrained = queue.drainTo(eventList, maxDrain);
            if (numDrained == 0)
                break;
            for (Object event : eventList) {
            	 // ....
            }
            eventList.clear();
        }
	}
	
}
