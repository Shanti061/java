package personExample;

import static personExample.generatePeople.alex;
import static personExample.generatePeople.lucy;
import static personExample.generatePeople.people;
import static personExample.generatePeople.addPeople;

public class Programme {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		System.out.println(alex);
		System.out.println(lucy);
		
		for(Person p : people)
		{
			System.out.println(p);
		}
		
		gui.commandDisplay();
		
		System.out.println(alex.talk());
		System.out.println(lucy.talk());
		
		lucy.sleep();
		System.out.println(lucy.talk());
		*/
		addPeople();
		WelcomeWindow gui = new WelcomeWindow();
		gui.setVisible(true);
	}

}
