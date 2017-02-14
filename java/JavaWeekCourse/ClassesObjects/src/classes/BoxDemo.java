package classes;

//EXAMPLE 1:

class Box {
	double width;
	double height;
	double depth;
	
	//constructor
	Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
		}
	
	//constructor overloading
	Box(double width, double height, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//method
	void volume()
	{
		System.out.println("Volume is ");
		System.out.println(width * height * depth);
	}
	
	//returning a value
	
	/*
	 * 		double volume()
	 * 		{ return width * height * depth; }
	 */
	
	//finalize() method - enable you to perform some action when it is destroyed. For example,
	//if an object is holding some non-java resource such as a file.
	//This method only call prior to garbage collection
	protected void finalize()
	{
		//finalization code here
	}
}

public class BoxDemo {

	public static void main(String[] args) {
		Demo2();
	}
	
	static void Demo1()
	{
		Box mybox = new Box();
		double vol;
		
		// assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
		
		// compute volume of box
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume is " + vol);
	}
	
	static void Demo2()
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		// assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		/* assign different values to mybox2's
		instance variables */
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// compute volume of first box
		mybox1.volume();
		
		// compute volume of second box
		mybox2.volume();
	}

}
