package Inheritance;

//Dynamic Method Dispatch:-
/*
* Method overriding forms the basis for one of Java's most powerful concepts; Dynamic Method Dispatch
* - The mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
* 
* When different types of objects are referred to, different versions of an overridden method
will be called. In other words, it is the type of the object being referred to (not the type of the
reference variable) that determines which version of an overridden method will be executed.
*/

//Dynamic Method Dispatch
class A5 {
	void callme() {
		System.out.println("Inside A's callme method");
	}
}
class B5 extends A5 {
	//override callme()
	void callme() {
		System.out.println("Inside B's callme method");
	}
}
class C5 extends A5 {
	//override callme()
	void callme() {
		System.out.println("Inside C's callme method");
	}
}

public class Dispatch {

	public static void main(String[] args) {
		A5 a = new A5(); // object of type A
		B5 b = new B5(); // object of type B
		C5 c = new C5(); // object of type C
		
		A5 r; // obtain a reference of type A
		
		r = a; // r refers to an A object
		r.callme(); // calls A's version of callme
		
		r = b; // r refers to a B object
		r.callme(); // calls B's version of callme
		
		r = c; // r refers to a C object
		r.callme(); // calls C's version of callme

	}

}
