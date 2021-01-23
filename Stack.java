package dataStruct;

import java.util.Scanner;

class Stack
{
	int maxsize=100,top=-1;
	int[]arr=new int[maxsize];
	
	void isEmpty()
	{
		if(top<0)
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println("elements are present in the stack");
		}
	}		
	
	
	void push(Scanner sc)
	{
		if(top==maxsize-1)
		{
			System.out.println("Stack is overflow");
		}
		else
		{
			System.out.println("Enter the element to be pushed");
			int val=sc.nextInt();
			top++;
			arr[top]=val;
			System.out.println("item pushed");
		}
	}
	void pop()
	{
		if (top<0)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			int a=arr[top];
			top--;
			System.out.println("removed element is: "+a);
		}
	}
		
	void peak()
	{
		int b=arr[top];
		System.out.println("Top element is: "+b);
	}
	
	void Display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]+"");
		}
	}
}
public class Stack
{
	public static void main(String[]args)
	{
		int choice=0;
		Stackk s=new Stackk();
		Scanner sc=new Scanner(System.in);
		//		s.isEmpty();
		do
		{
		
		System.out.println("1.Insert Element into Stack");
		System.out.println("2.Remove Element from Stack");
		System.out.println("3.Top element of Stack");
		System.out.println("4.Display Stack");
		System.out.println("Enter the choice:");
		choice=sc.nextInt();
		System.out.println(choice);
		s.isEmpty();
		switch(choice)
		{
		case 1:
		{
				s.push(sc);
				break;
		}
		case 2:
		{
				s.pop();
				break;
		}
		case 3:
		{
				s.peak();
				break;
		}	
		case 4:
		{
				s.Display();
				break;
		}
		default:
		{
			System.out.println("Enter valid choice");
		}
		}
	}while(choice!=0);
}
}



