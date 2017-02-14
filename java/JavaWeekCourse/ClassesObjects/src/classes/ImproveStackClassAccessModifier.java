package classes;

//improve StackDemo with access modifier

class Stack2
{
	//now both stck and tos are private
	private int stck[] = new int[10]; 
	private int tos;
	
	Stack2()
	{
		//initialise top of stack
		tos = -1;
	}
	
	//push an item onto the stack
	void push(int item)
	{
		if (tos == 9)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}
	
	//Pop an item from the stack
	int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
	
}


public class ImproveStackClassAccessModifier {

	public static void main(String[] args) {
		Stack2 mystack1 = new Stack2();
		Stack2 mystack2 = new Stack2();
		
		// push some numbers onto the stack
		for(int i=0; i<10; i++) mystack1.push(i);
		for(int i=10; i<20; i++) mystack2.push(i);
		
		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for(int i=0; i<10; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for(int i=0; i<10; i++)
			System.out.println(mystack2.pop());
		
		// these statements are not legal
		// mystack1.tos = -2;
		// mystack2.stck[3] = 100;

	}

}
