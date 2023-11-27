package com.demo.src;
import java.util.Scanner;

public class CircularLinkedList {
	
	public class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}	
	}
	Node head=null;
	Node tail=null;
	
	public void creation()
	{
		int d;

		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter data: ");
		int data=sc.nextInt();
		Node newnode=new Node(data);
		
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			newnode.next=head;
		}
		else
		{
			newnode.next=head;
			head=newnode;
			tail.next=head;
		}
		System.out.println("Do you want to insertdata again, press 1");
		d=sc.nextInt();
		}while(d==1);
	}
		

	
	public void Display()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("LL does not exit");
		}
		else
		{
			do 
			{
				System.out.println(temp.data);
				temp=temp.next;
			}while(temp!=head);
		}
	}

	public static void main(String[] args) {
		
		CircularLinkedList CL =new CircularLinkedList();
		CL.creation();
		CL.Display();
		
	}

}
