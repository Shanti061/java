package classes;

class RacTest
{
	int values[];
	
	RacTest(int i)
	{
		values = new int[i];
	}
	
	//display array -- recursively
	void printArray(int i)
	{
		if (i == 0)
			return;
		else printArray(i - 1);
		System.out.println("[" + (i-1) + "] " + values[i-1]);
	}
}


public class RecursionTwo {

	public static void main(String[] args) {
		RacTest ob = new RacTest(10);
		int i;
		
		for(i=0;i<10;i++)
			ob.values[i] = i;
		
		ob.printArray(10);

	}

}
