package classes;

//static - allow creating of members that can be used by itself, without reference to a specific object instance.

//as soon as the class is loaded, all the static statements are run.
//To use outside of the class, you just need to specify the class name with the static members

class StaticDemo
{
	static int a = 42;
	static int b = 99;
	static final int c = 10;
	
	static void callMe()
	{
		System.out.println("Static Demo a = " + a);
	}
}


public class UseStatic {

	static int a = 3;
	static int b;
	
	static void meth(int x)
	{
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	static
	{
		System.out.println("Static block initialised");
		b = a * 4;
	}
	
	public static void main(String[] args) {
		meth(42);
		StaticDemo.callMe();
		System.out.println("Static Demo b = " + StaticDemo.b);
		//this fail
		//StaticDemo.c = 20;

	}

}
