package exercises;

public class Animal implements commonCharacters {
	
	private int age;
	private String name;
		
	public Animal(int age, String name) {
		super(); //call constructor in the direct parent class (java.lang.Object - no argument)
		this.age = age;
		this.name = name;
	}
	
	public Animal(int age) {
		super();
		this.age = age;
		this.name = null;
	}
	
	//method
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Animal: [" + this.name + " " + this.age + "] ";
	}

	@Override
	public void eat() {
		// implement something
		
	}

	@Override
	public String sense() {
		// implement something
		return null;
	}
}

interface commonCharacters
{
	void eat();
	String sense();
}


