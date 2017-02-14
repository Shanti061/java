package classes;

//can can normal parameters along with variable-length parameter, however, must be last specified

class VarArgs2 {
	//msg is normal param, v is varangs parameter
	static void vaTest(String msg, int ... v)
	{
		System.out.print(msg + v.length + " Contents: ");
		
		for (int x : v)
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		vaTest("One vararg: ", 10);
		vaTest("Three varargs: ", 1, 2, 3);
		vaTest("No varargs: ");
	}

}
