package test;

import queue.CircularQueue;

public class Test {
	
	public static void main(String[] args) {
		
		CircularQueue cq = new CircularQueue(5);
		for(int i = 0 ;i<cq.getSize();i++) {
			cq.enQueue(i);
		}
		System.out.println(cq);
	}

}
