
import java.util.Scanner;

class QNode {
	public int info;
	public QNode next;
	
	public QNode()
	{
		info =0;
		next = null;
	}
}

public class QueueLL {
	QNode rear;
	QNode front;
	
	public QueueLL()
	{
		rear = null;
		front = null;
	}
	
	public void enqueue(int el)
	{
		QNode nnode = new QNode();
		nnode.info = el;
		nnode.next = null;
		
		if(rear == null)
			rear = front = nnode;
		else
		{
			rear.next = nnode;
			rear = nnode;
		}
	}
 
	public void dequeue()
	{
	    if(front == null)
	    	System.out.println("Queue is empty !!!");
	    else if(front == rear)
	    {
	    	System.out.println("The deleted element: "+ front.info);
	    	front = rear = null;
	    }
	    else {
	    	System.out.println("The deleted element: "+ front.info);
	    	front = front.next;
	    }
	}
	
	public void display()
	{
		if(front == null)
	    	System.out.println("Queue is empty !!!");
	    else 
	    {
	    	System.out.println("The Queue elements are: ");
            QNode temp = front;
            while(temp != null)
            {
            	System.out.println(temp.info);
            	temp = temp.next;
            }
	    }
		
	}
	
	public static void main (String [] args) {
		int choice;
		int el;
		Scanner sc = new Scanner(System.in);
		QueueLL q = new QueueLL();
		
		System.out.println("1. Enqueue ");
		System.out.println("2. Dequeue ");
		System.out.println("3. Display ");
		
		do {
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
					q.dequeue();
					break;
				case 3:
					q.display();
					break;
				default:
					System.out.println("Invalid Choice !!!");
		    	}
		
	     } while(choice < 4);
   }
}
