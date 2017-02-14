package classes;

//Nested Class

/*
 * If class B is defined within class A, then B does not exist independently of A.
 * A nested class has access to the members, including private members, of the class in which it is nested.
 * However, the enclosing class does not have access to the members of the nested class.
 * 
 * Two types: Static and Non-static
 * 
 * Static nested class: with static modifier applied,
 * must access the non-static members of its enclosing class through an object.
 * 
 * Non-static (inner class - most important):
 * has access to all of the variables and methods of its outer class and may refer to them directly
 * in the same way that other non-static members of the outer class do.
 * 
 * NOTE: It is possible to define inner classes within any block scope 
 */

//demonstrate an inner class
class Outer
{
	int outer_x = 100;
	
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner
	{
		int y = 10; //local to Inner
		
		void display()
		{
			System.out.println("display: outer_x = " + outer_x);
		}
	}
	
	void showY()
	{
		//System.out.println(y); //error, y not known here
	}
}


public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();

	}

}
