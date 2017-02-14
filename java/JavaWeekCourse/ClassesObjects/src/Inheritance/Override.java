package Inheritance;

//Method overriding.

//Dynamic Method Dispatch:-
/*
 * Method overriding forms the basis for one of Java's most powerful concepts; Dynamic Method Dispatch
 * - The mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
 */

class A4 {
	int i, j;
	A4(int a, int b) {
		i = a;
		j = b;
	}
//display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B4 extends A4 {
	int k;
	B4(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	// display k – this overrides show() in A
	void show() {
		System.out.println("k: " + k);
		super.show(); //access superclass method show
	}
}

public class Override {

	public static void main(String[] args) {
		B4 subOb = new B4(1, 2, 3);
		subOb.show(); // this calls show() in B

	}

}
