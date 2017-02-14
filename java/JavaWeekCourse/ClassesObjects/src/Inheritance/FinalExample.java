package Inheritance;

//using final to prevent overriding
class A6 {
	final void meth() {
		System.out.println("This is a final method.");
	}
}
class B6 extends A6 {
	void meth() { // ERROR! Can't override.
		System.out.println("Illegal!");
	}
}

//using final to prevent inheritance
final class A7 {
	//...
	}
	// The following class is illegal.
class B7 extends A7 { // ERROR! Can't subclass A
	...
}

public class FinalExample {

}
