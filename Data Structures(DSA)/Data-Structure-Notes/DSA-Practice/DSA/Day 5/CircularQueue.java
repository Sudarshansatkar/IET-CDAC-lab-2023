package queue;

import java.util.Arrays;

public class CircularQueue {
	
	int [] CircularQueue;
	private int size;
	private int first;
	private int rear;
	
	public CircularQueue() {
		size = 5;
		first = 0;
		rear = 0;
		CircularQueue = new int[5];
	}
	public CircularQueue(int size) {
		first = 0;
		rear = 0;
		CircularQueue = new int[size];
	}
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if((first==rear) || (first-1!=rear)) {
			return true;
		}else if((size-1!=rear)&&first==0) {
			return true;
		}else {
			System.out.println("Queue is not empty");
		}
		return false;
	}
	
	public boolean isFull() {
		if((rear==size-1) && (first==0)) {
			return true;
		}else if(first-1==rear) {
			return true;
		}else {
			System.out.println("Queue is not full");
		}
		return false;
	}
	
	
	public boolean enQueue(int num) {
		if(!isFull()) {
			rear++;
			CircularQueue[rear] = num;
			return true;
		}
		return false;
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			int num = CircularQueue[first];
			first++;
			return num;
		}
		return -1;
	}
	@Override
	public String toString() {
		return "CircularQueue [CircularQueue=" + Arrays.toString(CircularQueue) + "]";
	}
	
	
	
	
}
