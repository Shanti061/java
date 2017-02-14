package personExample;

import static personExample.generatePeople.people;

import java.time.LocalDate;
import java.util.List;

public class TaskProcessing {
	
	static void printAll() {
		for(Person p : people) {
			System.out.println(String.format("[%s] " + p, people.indexOf(p)));
		}
	}
	
	static void createPerson(List<String> data) {
		Person temp = new Person(data.get(0), data.get(1), LocalDate.of(Integer.parseInt(data.get(2)), 
				Integer.parseInt(data.get(3)), Integer.parseInt(data.get(4))));
		people.add(temp);
	}
	
	static int searchByFirstName(String firstName) {
		
		for(Person p : people) {
			if(p.getFirstName().contains(firstName))
			{
				return people.indexOf(p);
			}
		}
		return 0;
	}
	
	static void editDetails(int index, List<String> data) {
			people.get(index).setFirstName(data.get(0));
			people.get(index).setLastName(data.get(1));
			people.get(index).setBirthDate(LocalDate.of(Integer.parseInt(data.get(2)), Integer.parseInt(data.get(3)),
							Integer.parseInt(data.get(4))));
			
	}
	
	static void removePerson(int index) {
		people.remove(index);
	}
}
