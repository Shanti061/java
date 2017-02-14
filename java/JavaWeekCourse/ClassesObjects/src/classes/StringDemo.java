package classes;

/*
 * Every string you create is actually an object of type String
 * Objects of type string are immutable; once created, its content cannot be altered.
 * 
 * Java defined StringBuffer and StringBuilder peer classes, which allow string to be altered.
 */

public class StringDemo {

	public static void main(String[] args) {
		String strOb1 = "First String";
		String strOb2 = "Second String";
		String strOb3 = strOb1 + " and " + strOb2;
		
		String strOb4 = strOb1;
		
		//array of Strings
		String str[] = { "one", "two", "three" };
		
		System.out.println(strOb1);
		System.out.println(strOb2);
		System.out.println(strOb3);
		
		//use Length(), equal() and charAt()

		//use length() to check length
		System.out.println("Length of strOb1:" + strOb1.length());
		
		//obtain the character with charAt()
		System.out.println("Char at index 3 in strOb1: " + strOb1.charAt(3));
		
		//use equal() to compare between strings
		if(strOb1.equals(strOb2))
			System.out.println("strOb1 == strOb2");
		else
			System.out.println("strOb1 != strOb2");
		
		if(strOb1.equals(strOb4))
			System.out.println("strOb1 == strOb4");
			else
			System.out.println("strOb1 != strOb4");
		
		for(int i=0; i<str.length; i++)
			System.out.println("str[" + i + "]: " + str[i]);
	}

}
