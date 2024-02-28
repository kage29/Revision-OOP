package com.jdc.itr;

import java.util.*;

public class DequeSample {
	
		public static void main(String[] args) throws InterruptedException {
		Deque<Integer> dq = new ArrayDeque<Integer>();
			for(int i=0; i < 10; i++) {
				if(i%2 == 0)
					dq.addFirst(i);
				else
					dq.addLast(i);
			}
			while(!dq.isEmpty()) {
				System.out.println(dq.removeLast());
				Thread.sleep(1000);
			}
		}
		
}
