package Inheritance;

/*
 * It is important to understand that it is the type of the reference variable—not the type
of the object that it refers to—that determines what members can be accessed. That is,
when a reference to a subclass object is assigned to a superclass reference variable, you will
have access only to those parts of the object defined by the superclass.
 */

public class RefDemo {

	public static void main(String[] args) {
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;
		
		vol = weightbox.volume();
		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + weightbox.weight);
		System.out.println();
		
		// assign BoxWeight reference to Box reference
		plainbox = weightbox;
		vol = plainbox.volume(); // OK, volume() defined in Box		
		System.out.println("Volume of plainbox is " + vol);
		
		/* The following statement is invalid because plainbox
		does not define a weight member. */
		// System.out.println("Weight of plainbox is " + plainbox.weight);

	}

}
