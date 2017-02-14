package exercises;

import java.util.Scanner;

public class DatingAgency {
	// keyboard input reader
	private static Scanner kb = new Scanner(System.in);

	/**
	 * Represents a person (Male or Female).
	 */
	private static class Person {
		String name;
		char gender;
		int age;
		double height;
		boolean smoker;
		boolean available;

		// Default constructor
		public Person() {
			available = true;
		}

		// Another useful constructor
		public Person(String name, char gender, int age, double height,
				boolean smoker) {
			this(); // invokes the default constructor
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.height = height;
			this.smoker = smoker;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	/**
	 * Application entry point.
	 */
	public static void main(String[] args) {
		System.out.println("Computer Dating Agency");

		// creates an array to store clients' data
		Person clients[] = new Person[6];

		System.out.print("Would you like to use sample data? (Y/N) ");
		String input = kb.nextLine();
		if ("Y".equalsIgnoreCase(input)) {
			// sample data
			generateSampleData(clients);
		} else {
			// asks the user the input data
			askUserToInputData(clients);
		}

		// prints out the couples
		System.out.println("\n------------------");
		System.out.println("List of Couples");
		printCouples(clients);
	}

	private static void askUserToInputData(Person[] clients) {
		for (int i = 0; i < clients.length; i++) {
			Person person = new Person();

			System.out.println("-----------------------------");

			// asks the name
			System.out.print("Enter the Name: ");
			person.name = kb.nextLine();

			// asks the gender
			System.out.print("Enter the Gender: (M or F) ");
			person.gender = kb.nextLine().charAt(0);

			// asks the age
			System.out.print("Enter the Age in years: ");
			person.age = Integer.parseInt(kb.nextLine());

			// asks the age
			System.out
					.print("Enter the Height in meters and centimeters: (e.g. 1.85) ");
			person.height = Double.parseDouble(kb.nextLine());

			// asks the age
			System.out.print("Smoker? (Y or N) ");
			String input = kb.nextLine();
			person.smoker = input.equals("Y") || input.equals("y");

			// stores the new client in the array
			clients[i] = person;
		}
	}

	private static void generateSampleData(Person[] clients) {
		clients[0] = new Person("Brenda", 'F', 25, 1.60, false);
		clients[1] = new Person("John", 'M', 30, 1.78, true);
		clients[2] = new Person("Paul", 'M', 22, 1.89, false);
		clients[3] = new Person("Mary", 'F', 22, 1.86, true);
		clients[4] = new Person("Serena", 'F', 23, 1.70, false);
		clients[5] = new Person("Bob", 'M', 24, 2.00, false);
	}

	private static void printCouples(Person[] clients) {
		// counts the number of men and women
		int menCount = 0, womenCount = 0;
		for (Person client : clients) {
			switch (client.gender) {
			case 'M':
			case 'm':
				menCount++;
				break;
			case 'F':
			case 'f':
				womenCount++;
				break;
			}
		}

		// checks whether there is at least one man and one woman
		if (menCount == 0 || womenCount == 0) {
			System.out.println("Impossible to make couples.");
			return;
		}

		// slit the customers into men and women arrays
		Person men[] = new Person[menCount];
		Person women[] = new Person[womenCount];

		// fills in the arrays
		int menIndex = 0;
		int womenIndex = 0;
		for (Person client : clients) {
			switch (client.gender) {
			case 'M':
			case 'm':
				men[menIndex] = client;
				menIndex++;
				break;
			case 'F':
			case 'f':
				women[womenIndex] = client;
				womenIndex++;
				break;
			}
		}

		// tries to make couples
		int couplesCount = 0;
		for (Person man : men) {
			for (Person woman : women) {
				System.out.println();
				System.out.println("Matching " + man + " and " + woman);

				// checks whether this woman is available or not
				if (!woman.available) {
					System.out.println(woman + " is NOT available");
					continue; // advance to the next woman
				} else {
					System.out.println(woman + " is available");
				}

				boolean matches = matchSmokers(man, woman)
						&& matchAges(man, woman) && matchHeights(man, woman);

				// if all attributes match, we have found a perfect couple!
				if (matches) {
					System.out.println("PERFECT MATCH: " + man.name + " and "
							+ woman.name);
					man.available = false;
					woman.available = false;
					couplesCount++;
					break; // next man
				} else {
					System.out.println("CHARACTERISTICS DO NOT MATCH");
				}
			}
		}

		System.out.println("\nNumber of couples: " + couplesCount);
	}

	/**
	 * Male must not be shorter nor more than 25cm taller than female.
	 */
	private static boolean matchHeights(Person man, Person woman) {
		double heightDiff = Math.abs(man.height - woman.height);
		System.out.printf("%s has %.2f meters\n", man, man.height);
		System.out.printf("%s has %.2f meters\n", woman, woman.height);
		System.out.printf("The height difference is %.2f meters\n", heightDiff);
		return (heightDiff <= 0.25);
	}

	/**
	 * If one smokes, both must smoke.
	 */
	private static boolean matchSmokers(Person man, Person woman) {
		boolean matches = true;
		if (man.smoker || woman.smoker) {
			System.out.println(man + (man.smoker ? " is " : " is NOT ")
					+ "a smoker");
			System.out.println(woman + (woman.smoker ? " is " : " is NOT ")
					+ "a smoker");
			matches = (man.smoker && woman.smoker);
		}
		return matches;
	}

	/**
	 * If male under 26, Female not more than 1 year older.
	 */
	private static boolean matchAges(Person man, Person woman) {
		boolean matches = true;
		if (man.age < 26) {
			System.out.println(man + " is " + man.age + " years old");
			System.out.println(woman + " is " + woman.age + " years old");
			matches = (woman.age - man.age) <= 1;
		}
		return matches;
	}
}
