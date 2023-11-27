package com.demo.src;
import java.util.Scanner;

import com.demo.src.CircularLinkedList.Node;

public class InsertionCircularLL {
	
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
	
	public void Insertion()
	{
		int data,choice,pos,d;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter Data");
		data=sc.nextInt();
		Node newnode=new Node(data);
		
		if(head==null)
		{
			System.out.println("LL does not exist");
		}
		else
		{
			System.out.println("1.Enter at beginning\n2.Enter at end\n3.Enter at Specific position\nchoice:");
			choice=sc.nextInt();
			switch(choice)
			
			{
			case 1:
				newnode.next=head;
				head=newnode;
				tail.next=head;
				break;
				
			case 2:
				tail.next=newnode;
				tail=newnode;
				newnode.next=head;
				break;
				
			case 3:
				System.out.println("Enter the position where you want to insert data: ");
				pos=sc.nextInt();
				
				Node temp=null;
				for(int i=0;i<pos-1;i++)
				{
					temp.next=newnode;
				}
				newnode.next=temp.next;
				temp.next=newnode;
				break;
			}
		}
		System.out.println("Do you want to add more data, press 1");
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
		InsertionCircularLL CL=new InsertionCircularLL();
		CL.Insertion();
		CL.Display();

	}

}
