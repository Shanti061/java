package classes;

//Access Modifier Example:

/*
 * public - can be accessed by any other code.
 * private - can only be accessed by other members of its class.
 * protected (Default) - applies only when inheritance is involved.
 * 
 */

class Test3
{
	int a; //default - protected
	public int b; //public access
	private int c;
	
	void setC(int i)
	{
		c = i;
	}
	
	int getC()
	{
		return c;
	}
}

public class AccessTest {

	public static void main(String[] args) {
		Test3 ob = new Test3();
		
		ob.a = 10;
		ob.b = 20;
		
		//This NOT WORK! ERROR
		//ob.c = 100;
		
		ob.setC(100);
		System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());

	}

}
