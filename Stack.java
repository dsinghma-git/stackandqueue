// implementation of Stack in array
public class Stack
{
final int SIZE = 10;
public int items [] = new int[SIZe];
public int top;

public Stack()
{
	top = -1;
}

int isempty() 
{ if(top == -1)
    return 1; 
else
    return 0; 
   } 

int isfull() 
{ 
   if(top == SIZE -1)
    return 1;  
    else
    return 0; 
   } 

public void push(int element)
{
	if(isfull()==1)  
		System.out.println("\n \n The stack is overflow: Stack full ! \n"); 
     else
	 items[++top]=element;
	  /* First increase top by 1 and store element at top position*/ 
 }

public void pop()
{ 
     if(isempty() == 1) 
	 System.out.println("\n\n stack Underflow: Empty Stack!!!"); 
     else   
	 System.out.println("\n The deleted item is \t" + items[top--]); 	
          /*deletes top element and decrease top by 1 */
}

public static void main(String [] args) {
int choice;
int item;
Scanner sc = new Scanner(System.in);
Stack s = new Stack();
System.out.println("1. PUSH ");
System.out.println("2. POP ");
System.out.println("3. Display");
System.out.println("4. Exit");
while(true)
{
System.out.println("Enter your choice: ");
choice = sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter data item to be inserted: ");
item = sc.nextInt();
s.push(item); 
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
System.out.println(" Invalid choice !");
}
};
} // end of the main

}
