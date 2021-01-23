import  java.util.*;
public class LinkedList {
	
	Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;							
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;			//always use this statement while traversing //here Node n is temporary node in which head address is store 
									
			while(n.next!=null)
			{
				n=n.next;			// it is used to iterate the list to reach the last node
				
			}
			n.next=node;			// by the last node again one node is attached
		}
	}
	public void insertAtStart(int data)
	{
		Node node=new Node();
		node.data=data;							  
		node.next=null;
		node.next=head;
		head=node;
	}
	public void insertAt(int index,int data)
	{
		Node node=new Node();
		node.data=data;							   
		node.next=null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			
		
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	public void deleteAt(int index)
	{
		Node n=head;
		Node n1=null;
		for(int i=0;i<index;i++)
		{
			n=n.next;
		}
		n1=n.next;
		n.next=n1.next;
		System.out.println("deleted number"+n1.data);
	}
	
	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;					//here this statement is added because to iterate to next node
		}
		System.out.println(node.data);		//to print last node
	}

}
