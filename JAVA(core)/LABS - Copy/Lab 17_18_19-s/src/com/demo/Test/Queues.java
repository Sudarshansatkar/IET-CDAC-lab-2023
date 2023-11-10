package com.demo.Test;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q using linkedlist");
		Queue<Integer> l1 = new LinkedList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		System.out.println("Size : "+l1.size());
		System.out.println("FirstElement "+l1.peek());
		System.out.println("Display Queue "+l1);
		
		l1.poll();
		System.out.println("Display Q "+l1);
		l1.remove(20);
		System.out.println("Display Q" +l1);
		
		System.out.println("Q using ArrayDeque");
		Queue<Integer> q = new ArrayDeque<>();
		q.add(100);
		q.add(200);
		q.add(300);
		
		System.out.println("Size : "+q.size());
		System.out.println("FirstElement "+q.peek());
		System.out.println("Display Queue "+q);
		
		q.poll();
		System.out.println("Display Q "+q);
		q.remove(100);
		System.out.println("Display Q" +q);
	}
}
