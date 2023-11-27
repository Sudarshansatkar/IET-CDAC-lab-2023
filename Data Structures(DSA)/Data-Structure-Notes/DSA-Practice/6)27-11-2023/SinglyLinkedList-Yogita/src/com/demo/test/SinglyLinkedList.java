package com.demo.test;
import java.util.Scanner;

public class SinglyLinkedList {
	
	static class Node{
	 int data;
	 Node next;
	//passing data when new node added
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	}
	//at initial condition head is null
	Node head=null;
	//creating a new linked list
	public void ListCreation()
	{
		int data,n;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter data: ");
		data=sc.nextInt();
		Node newnode=new Node(data);
		//checking for head is null or not if null then store add of newnode
		//i.e. linked list is not existing
		if(head==null)
		{
			head=newnode;
		}
		//linked list existing and adding new node at beginning
		else
		{
			newnode.next=head;
			head=newnode;
		}
		System.out.println("Add More data, if yes press 1");
		n=sc.nextInt();
		}while(n==1);
	}

	public void ListDisplay()
	{
		Node temp=head;
		if(head==null) {
			System.out.println("Linked List Does not exist");
		}
		
		else
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}


	public static void main(String[] args) {
		SinglyLinkedList ll=new SinglyLinkedList();
		ll.ListCreation();
		ll.ListDisplay();
		
	}

}
