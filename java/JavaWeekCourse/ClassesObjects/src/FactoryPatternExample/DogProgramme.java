package FactoryPatternExample;

public class DogProgramme {
	public static void main(String[] args) {
		Dog dog = DogFactory.buildDog(DogType.SMALL);
		dog.bark();
		
		dog = DogFactory.buildDog(DogType.BIG);
		dog.bark();
		
		dog = DogFactory.buildDog(DogType.WORKING);
		dog.bark();
	}
}
