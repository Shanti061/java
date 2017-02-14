package personExample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class generatePeople {

	public static Person alex = new Person("Alex", "Kennedy",LocalDate.of(1983, 4, 16));
	public static Person lucy = new Person("Lucy", "Miller",LocalDate.of(1994, 10, 7));
	
	public static List<Person> people = new ArrayList<>();
	
	static void addPeople()
	{
		people.add(alex);
		people.add(lucy);
	}
	
	
}
