package personExample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Person {
	private String firstName;
	private String lastName;
	public LocalDate birthDate;
	SexType sex;
	BloodType bloodType;
	short height; //height in metric
	double weight;
	
	private boolean isSleeping;
	
	//Constructors
	Person() {}
	//Constructors overloading
	Person(String fn, String ln, LocalDate dob) {
		this.firstName = fn;
		this.lastName = ln;
		this.birthDate = dob;
		this.isSleeping = false;
	}
	
	Person(String fn, String ln, LocalDate dob, SexType sex, 
				BloodType bloodType, short height, double weight) {
		this.firstName = fn;
		this.lastName = ln;
		this.birthDate = dob;
		this.bloodType = bloodType;
		this.height = height;
		this.weight = weight;
	}
	
	//getters
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public SexType getSexType() { return sex; }
	public short getHeight() { return height; }
	public double weight() { return weight; }
	
	//setters
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setBirthDate(LocalDate bd) { this.birthDate = bd; }	
	public void setHeight(short height) { this.height = height; }
	public void setWeight(double weight) { this.weight = weight; }
	
	//methods
	public long getAge() {
		if(birthDate == null)
			return 0;
		long years = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
		return years;
		
	}
	
	public String talk() throws Exception
	{
		if(isSleeping)
			throw new Exception("Cannot talk while sleeping...");
		
		return String.format("%s %s says hello.", this.firstName, this.lastName);
	}
	
	public void sleep() {
		this.isSleeping = true;
	}
	
	@Override
	public String toString(){
		return String.format("Person: %s %s %s",firstName, lastName, getAge());
	}
}
