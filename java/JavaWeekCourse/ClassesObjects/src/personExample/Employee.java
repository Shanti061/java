package personExample;

import java.time.LocalDate;

public class Employee extends Person {
	private String position;
	private LocalDate hireDate;
	
	Employee() {}
	
	Employee(String fn, String ln, LocalDate dob, String pos, LocalDate hd)
	{
		super(fn, ln, dob);
		this.position = pos;
		this.hireDate = hd;
	}
	
	@Override
	public String toString() {
		return String.format("Character: %s %s %s %s %s", getFirstName(), getLastName(), 
				getAge(), this.position, this.hireDate);
	}
}
