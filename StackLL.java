// Linked list implementation of stack
import java.util.Scanner;

class SNode {
	public int info;
	public SNode next;
	
	public SNode()
	{
		info =0;
		next = null;
	}
}

public class StackLL {
	SNode top;
	public StackLL()
	{
		top = null;
		
	}
	
	public void push(int el)
	{
		SNode nnode = new SNode();
		nnode.info = el;
		if(top == null)
			top = nnode;
		else
		{
			nnode.next = top;
			top = nnode;
		}
	}
 
	public void pop()
	{
	    if(top == null)
	    	System.out.println("Stack is empty !!!");
	    else if(top.next == null)
	    {
	    	System.out.println("The deleted element: "+ top.info);
	    	top = null;
	    }
	    else {
	    	System.out.println("The deleted element: "+ top.info);
	    	top = top.next;
	    }
	}
	
	public void display()
	{
		if(top == null)
	    	System.out.println("stack is empty !!!");
	    else 
	    {
	    	System.out.println("The Stack elements are: ");
        	SNode temp = top;
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
		StackLL s = new StackLL();
		while(true)
		{
			System.out.println("1. PUSH ");
			System.out.println("2. POP");
			System.out.println("3. Display ");
			System.out.println("4. Exit ");
		
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println(" Enter a number to insert: ");
				el = sc.nextInt();
				s.push(el);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Choice !!!");
		    	}// end of switch
	     }// end of while
   } // end of main
} // end of class
