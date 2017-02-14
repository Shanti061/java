package personExample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static personExample.generatePeople.people;


public class gui  {
	
	static Scanner input = new Scanner(System.in);
	
	static void commandDisplay() {
	int choice;
		do {
			System.out.println("Welcome to People records:");
			System.out.println("1. Add a Person");
			System.out.println("2. Edit a Person");
			System.out.println("3. Remove a Person");
			System.out.println("4. List all People");
			System.out.println("5. Search by First Name");
			System.out.println("6. Terminate");
			System.out.println();
			System.out.print("Enter option: ");
			
			choice = input.nextInt();
			
		} while (choice < 1 || choice > 6);
		
		
		List<String> tempData = new ArrayList<>();
		switch(choice) {
		case 1:
			tempData = inputScreen();
			TaskProcessing.createPerson(tempData);
			commandDisplay();
		case 2:
			int index = findDetails();
			tempData = inputScreen();
			TaskProcessing.editDetails(index, tempData);
			commandDisplay();
		case 3:
			TaskProcessing.removePerson(removeScreen());
			commandDisplay();
		case 4:
			TaskProcessing.printAll();
			commandDisplay();
		case 5:
			index = findDetails();
			System.out.println(people.get(index));
			commandDisplay();
		case 6:
			break;
		}
	}
	
	static List<String> inputScreen() {
		List<String> personData = new ArrayList<>();
		String firstName, lastName, dob;
		
		//Scanner personInput = new Scanner(System.in);
		input.nextLine();
		
		System.out.print("Enter First Name: ");
		personData.add(input.nextLine());
		
		System.out.print("Enter Last Name: ");
		personData.add(input.nextLine());
		
		System.out.print("Enter Date Of Birth (YYYY/MM/DD): ");
		dob = input.nextLine();	
		String[] dobData =  dob.split("/");
		
		for(int i = 0; i <= dobData.length - 1; i++)
			personData.add(dobData[i]);
		
		System.out.println();
		
		return personData;
				
	}

	
	static int findDetails() {
		
		System.out.print("Enter Person first Name: ");
		String firstName = input.next();
		return TaskProcessing.searchByFirstName(firstName);
	}
	
	static int removeScreen() {
		System.out.println("Enter Person index to remove: ");
		return input.nextInt();
	}
}
