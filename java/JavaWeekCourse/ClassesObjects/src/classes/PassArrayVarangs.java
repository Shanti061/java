package classes;

/*
 * Varangs (Varable-length arguments) - simplifies the creation of methods that need to take a variable number of arguments
 * 
 * Varangs method - A method that takes a variable number of arguments
 * 
 * traditional common method: Arguments were put into an array, and then the array was passed to the method
 */

public class PassArrayVarangs {
	
	static void vaTest(int v[])
	{
		System.out.print("Number of args: " + v.length + "Contents: ");
		
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		//Notice how an array must be created to hold the arguments
		int n1[] = {10};
		int n2[] = {1,2,3};
		int n3[] = { };
		
		vaTest(n1); // 1 arg
		vaTest(n2); // 3 args
		vaTest(n3); // no args

	}

}
