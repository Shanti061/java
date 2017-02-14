package FactoryPatternExample;

//define Dog
public class Dog {
	int height, width;
	double weight;
	String description;
	boolean doubleCoat; //if false, mean single Coat
	TailType tailType;
	
	public void bark() {
		System.out.println("Generic Dog...");
	}
}
