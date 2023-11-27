package com.demo.test;
import java.util.Scanner;

public class InsertionDeletionLL 
{

	static class Node
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
	
	public void Creation()
	{
		int data,choice,pos,d;
		Scanner sc=new Scanner(System.in);
		do 
		{
		System.out.println("Enter data: ");
		data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			System.out.println("1.Enter at beginning\n2.Enter at end\n3.Enter at specific position\nChoice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
					newnode.next=head;
					head=newnode;
				break;
				
			case 2: 
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newnode;
				break;
				
			case 3:
				System.out.println("Enter position where you want to insert newnode: ");
				pos=sc.nextInt();
				Node temp1=head;
				for(int i=0;i<pos-1;i++)
				{
					temp1=temp1.next;
				}
				newnode.next=temp1.next;
				temp1.next=newnode;
				break;
			}
		}
		System.out.println("Do you want to enter data again, press 1");
		d=sc.nextInt();
		}while(d==1);
	}

	public void delete()
	{
		int d;
		Scanner sc=new Scanner(System.in);
		do {
		if(head==null)
		{
			System.out.println("LL is empty");
		}
		
		else
		{
			System.out.print("1.Delete from beginning\n2.Delete from end\n3.delete from specific position\nchoice:");
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					Node temp=head;
					temp=temp.next;
					head=temp;
					break;
					
				case 2:
					Node temp1=head;
					Node ptr=temp1.next;
					while(ptr.next!=null)
					{
						temp1=ptr;
						ptr=ptr.next;
					}
					temp1.next=null;
					break;
					
				case 3:
					System.out.println("Enter position : ");
					int pos=sc.nextInt();
					
					Node temp2=head;
					Node ptr1=temp2.next;
					for(int i=0;i<pos-1;i++)
					{
						temp2=ptr1;
						ptr1=ptr1.next;
					}
					temp2.next=ptr1.next;
					break;
			}
		}
		System.out.println("DO you want to delete more data, press 1");
		d= sc.nextInt();
		}while(d==1);
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
	public static void main(String[] args) 
	{
		InsertionDeletionLL DL=new InsertionDeletionLL();
		DL.Creation();
		DL.ListDisplay();
		DL.delete();
		DL.ListDisplay();
	}

}
