package FactoryPatternExample;

public class DogFactory {
	public static Dog buildDog(DogType model) {
		Dog dog = null;
		switch (model) {
		case SMALL:
			dog = new Poodle();
			break;
		case BIG:
			dog = new Husky();
			break;
		case WORKING:
			dog = new Labrador();
			break;
			
		default:
			//Implement something if it doesn't match
			break;
		}
		return dog;
	}
}
