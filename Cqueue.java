import java.util.Scanner;

public class Cqueue {
	
    	final int SIZE = 10;
	public int items[] = new int[SIZE];
	public int rear, front;
	
	public Cqueue()
	{
		front =SIZE-1;
		rear = SIZE-1;
	}
    
	boolean isEmpty()
	{
		if(rear==front)
		   return true;
		else
		   return false;
	}
	
	boolean isFull()
	{
		if(front == (rear + 1)%SIZE)
			return true;
		else
			return false;
	}
	
	public void enqueue(int ele)
	{
		if(isFull())
			System.out.println("Queue is full !!!");
		else
		{
			rear= (rear + 1)%SIZE;
			items[rear]= ele;
		}
			
	}
	
	
	public void dequeue()
	{
		if(isEmpty())
			System.out.println("Queue is empty !!!");
		else
		{   
			front = (front + 1) % SIZE;
			System.out.println("Deleted element : " + items[front]);
			
		}
	}
	
	public void display()
	{
		if(isEmpty())
			System.out.println("Queue is empty!!!");
		else
		{
			int i;
			System.out.println("Queue elements are:");
			for(i=(front + 1) % SIZE; i != rear;i = ( i + 1)%SIZE)
				System.out.print(items[i]+" ");
			System.out.println(items[rear]);
		}
	}

	public static void main(String args[])
	{
		int choice;
		int el;
		Scanner sc = new Scanner(System.in);
		Cqueue q = new Cqueue();
		
		System.out.println("1. Insert ");
		System.out.println("2. Display ");
		System.out.println("3. Delete ");
		System.out.println("4. Exit ");
		
		while(true){
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				
				switch(choice)
				{
				case 1: 
					System.out.println(" Enter a number to insert: ");
					el = sc.nextInt();
					q.enqueue(el);
					break;
				case 2:
					q.display();
					break;
				case 3:
					q.dequeue();
					break;
				case 4: 
				    System.out.println("\n Program Terminated !!");
					System.exit(0);
				default:
					System.out.println("Invalid Choice !!!");
		    	}
		
	     } 
   }
}
