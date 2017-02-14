package exercises;

public class Zebra extends Animal {
	public Zebra(int age) {
		super(age); //call Animal constructor, take single argument
	}
	public Zebra() {
		this(4);
}
}