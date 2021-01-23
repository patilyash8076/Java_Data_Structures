package Queue_implementation;

public class Queue_basic {
int size;
int front=0;
int rear=0;
int queue[]=new int[5];
		
public void isEmpty()
{
	if(front==0 && rear==0)
	{
		System.out.println("is empty");
	}
	else
	{
		System.out.println("Elements are present");
	}
}
public void enqueue(int data)
{
	queue[rear]=data;		//%5 to front and rear is done so that we can handle the 
								// exception.this is circular queue implementation
	rear++;
	size++;
	
}
public void dequeue()
{
	int q=queue[front];
	front++;
	size--;
		
}
public void show()
{
	System.out.print("Elements are:");
	for(int i=0;i<size;i++)
	{
		System.out.print(+queue[front+i]+" "); 	//here [front+i] is done because we are shifting
												// from front not from 0
	}
	System.out.println();
	for(int n:queue)
	{// enhanced for loop
		System.out.println(n);
	}
	
}
}
