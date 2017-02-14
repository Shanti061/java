package classes;

//Improve Stack class that uses the length array member


class Stack3
{
	private int stck[];
	private int tos;

	//allocate and initialise stack
	Stack3(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	
	//push an item onto stack
	void push(int item)
	{
		if(tos == stck.length - 1) //use length member
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	int pop()
	{
		if(tos < 0)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stck[tos--];
	}
}

public class StackImproveArray {

	public static void main(String[] args) {
		Stack3 mystack1 = new Stack3(5);
		Stack3 mystack2 = new Stack3(8);
		
		// push some numbers onto the stack
		for(int i=0; i<5; i++) mystack1.push(i);
		for(int i=0; i<8; i++) mystack2.push(i);
		
		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for(int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for(int i=0; i<8; i++)
			System.out.println(mystack2.pop());

	}

}
