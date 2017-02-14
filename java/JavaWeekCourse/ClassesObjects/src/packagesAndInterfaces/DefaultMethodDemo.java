package packagesAndInterfaces;

/*
 * The release of JDK 8 has changed by adding a new capability to interface called the --default method--
 * 
 * It lets you define a default implementation for an interface  method
 * 
 * Motivation:
 * 1. Provide a means by which interfaces could be expanded without breaking existing code.
 * Recall that there must be implemenations for all methods defined by an interface.
 * 
 * 2. Desire to specify methods in an interface that are, essentially, optional, depending
 * on how the interface is used.
 */


interface MyIF
{
	//This is a "normal" interface method declaration.
	//It does not define a default implementation
	int getNumber();
	
	//This is a default method, provides default implemenation
	default String getString()
	{
		return "Default String";
	}
	
	// This is a static interface method.
	static int getDefaultNumber() {
		return 0;
	}
}

class MyIFImp implements MyIF
{
	//Only getNumbers defined by MyIF needs to be implemented.
	//getString can be allowed to default
	@Override
	public int getNumber() {
		return 100;
	}
	
}

class MyIFImp2 implements MyIF {
	// Here, implementations for both getNumber( ) and getString( ) are provided.
	public int getNumber() {
		return 100;
	}
	public String getString() {
		return "This is a different string.";
		}
	}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		// Can call getNumber(), because it is explicitly
		// implemented by MyIFImp:
		System.out.println(obj.getNumber());
		// Can also call getString(), because of default
		// implementation:
		System.out.println(obj.getString());
		
		int defNum = MyIF.getDefaultNumber();
		System.out.println(defNum);

	}

}
