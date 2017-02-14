package packagesAndInterfaces;

/*
 * You can use interface to import shared constants into multiple classes by simply declaring
 * an interface that contains variables that are initialised to the desired values.
 * 
 * When you implement the interface, all of those variable anmes will be in scope as constants.
 */

import java.util.Random; //provides pseudorandom numbers

interface SharedConstants
{
	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}

class Question implements SharedConstants
{
	Random rand = new Random();
	int ask()
	{
		int prob = (int) (100 * rand.nextDouble()); //return random number int the range 0.0 to 1.0
		if (prob < 30)
			return NO;
		else if (prob < 60)
			return YES;
		else if (prob < 75)
			return LATER;
		else if (prob < 98)
			return SOON;
		else
			return NEVER;
	}
}

class AskMe implements SharedConstants {
	
	static void answer(int result)
	{
		switch(result)
		{
			case NO:
				System.out.println("No");
				break;
			case YES:
				System.out.println("Yes");
				break;
			case MAYBE:
				System.out.println("Maybe");
				break;
			case LATER:
				System.out.println("Later");
				break;
			case SOON:
				System.out.println("Soon");
				break;
			case NEVER:
				System.out.println("Never");
				break;
		}
	}

	public static void main(String[] args) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());

	}

}
