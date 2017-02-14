package Inheritance;

/*
 * The second form of super acts somewhat like this, except that it always refers to the
	superclass of the subclass in which it is used.
 */

class A2
{
	int i;
}

//create a subclass by extending class A2
class B2 extends A2
{
	int i; //this i hides the i in A
	
	B2(int a, int b)
	{
		super.i = a; //i in A2
		i = b; //i in B2
	}
	
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

public class UseSuper {
	public static void main(String args[]) {
			B2 subOb = new B2(1, 2);
			subOb.show();
		}
}
