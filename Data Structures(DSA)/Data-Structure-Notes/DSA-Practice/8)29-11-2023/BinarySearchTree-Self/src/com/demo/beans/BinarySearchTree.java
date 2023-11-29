package com.demo.beans;

public class BinarySearchTree 
{
	class Node
	{
		int data;
		Node left,right;
		
		public Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	private Node root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	

	
	public void insert(int key)					//insert key into tree
	{
		root=insertRec(root,key);
	}

	private Node insertRec(Node root, int key)   //private is done due to hiding of the method
	{
		//check whether tree is empty
		
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		
		if(key<root.data)         // insert into left subtree
		{
			root.left=insertRec(root.left,key);
		}
		
		else
			// insert into right subtree
		{
			root.right=insertRec(root.right,key);
		}
		
		return root;
	}

	
	//inorder traversal
	
		public void inorder()
		{
			inorderTraversal(root);
		}



		private void inorderTraversal(Node root) 
		{
			if(root!=null)
			{
				inorderTraversal(root.left);
				System.out.print(root.data+",");
				inorderTraversal(root.right);
			}
		}
		
	//preorder traversal
		
		public void preorder()
		{
			preorderTraversal(root);
		}



		private void preorderTraversal(Node root)
		{
			if(root!=null)
			{
				System.out.println(root.data+",");
				inorderTraversal(root.left);
				inorderTraversal(root.right);
			}
			
		}
	
	//post order traversal
		
		public void postorder()
		{
			postorderTraversal(root);
		}



	private void postorderTraversal(Node root) 
	{
		if(root!=null)
		{
			
			inorderTraversal(root.left);
			inorderTraversal(root.right);
			System.out.println(root.data+",");
		}
		
	}
		
		
}
