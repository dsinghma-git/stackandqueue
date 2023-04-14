// Array implementation of Linear Queue
import java.util.Scanner;
class LQueue {
	public final int max = 10;
	public int [] items = new int[max];
	public int front;
	public int rear;
	
	public LQueue()
	{
		front = 0;
		rear = -1;
	}
	
	public void enqueue(int x)
	{
		if(rear == max-1)
		{
			System.out.println("Queue is full !");
		}
		else
		{
			rear++;
			items[rear] = x;
			System.out.println(" Element inserted successfully! ");
		}
	}// end of method enqueue
	
	
	public void dequeue()
	{
		if(rear<front)
			System.out.println("Queue is empty !");
		else
		{
			System.out.println("Deleted item is: "+ items[front]);
			front ++;
		}			
	}
	
	public void display()
	{
		int i;
		if(rear < front )
			System.out.println(" Queue is empty !");
		else
		{
			System.out.println("Queue items are: ");
			for(i=front; i<=rear; i++)
				System.out.print("\t" + items[i]);
			System.out.println();
		}
	}

public static void main(String[] args) {
		
		int choice, x;
		LQueue q = new LQueue();
  		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Menu");
		System.out.println("--------------");
		System.out.println("1.Enqueue ");
		System.out.println("2.Dequeue ");
		System.out.println("3.Display ");
		System.out.println("4.Exit ");
		
		while(true)
		{
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: System.out.println("Enter the item to insert: ");
				 	x = sc.nextInt();
				 	q.enqueue(x);
				 	break;
				case 2: q.dequeue();
					break;
				case 3: q.display();
					break;
				case 4: System.exit(1);
				default:System.out.println("Invalid Choice !");
			}
		}
		
	}
} // end of class

