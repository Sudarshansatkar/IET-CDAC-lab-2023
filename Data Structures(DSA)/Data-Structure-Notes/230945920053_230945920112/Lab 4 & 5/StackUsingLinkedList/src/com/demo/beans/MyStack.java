package com.demo.beans;

public class MyStack {
	class Node {
		int data;
		Node next;
	}

	Node top;

	public MyStack() {
		this.top = null;
	}

}
