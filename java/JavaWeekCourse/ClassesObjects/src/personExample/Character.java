package personExample;

import java.time.LocalDate;

public class Character extends Person {
	private String role;
	private String homeWorld;
	
	Character() {}
	
	Character(String fn, String ln, String role, String homeworld, LocalDate dob) {
		super(fn, ln, dob);
		this.homeWorld = homeworld;
		this.role = role;
	}
	
	@Override
	public String talk() {
		return String.format("%s %s as Character says use the force.", getFirstName(), getLastName());
	}
	
	@Override
	public String toString(){
		return String.format("Character: %s %s %s %s %s", getFirstName(), getLastName(), 
					getAge(), this.homeWorld, this.role);
	}
}
