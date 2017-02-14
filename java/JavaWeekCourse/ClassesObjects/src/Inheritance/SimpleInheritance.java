package Inheritance;

//EXAMPLE 1: Superclass and Subclass relationship

class A
{
	int i, j;
	private int p; //private to A only
	
	void showij()
	{
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A
{
	int k;
	int total;
	
	void showk()
	{
		System.out.println("k: " + k);
	}
	
	void sum()
	{
		System.out.println("i+j+k: " + (i+k+j));
	}
	
	void sum2()
	{
		//total = i + p;
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		A superOb = new A();
		B subOb = new B();
		
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		System.out.println();
		
		/* The subclass has access to all public members of
		its superclass. */
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();
		subOb.showk();
		System.out.println();
		
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();

	}

}
