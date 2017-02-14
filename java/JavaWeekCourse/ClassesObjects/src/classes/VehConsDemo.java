package classes;

//EXAMPLE 1.1: Vehicles example

class Vehicle
{
	int passengers; //number of passengers
	int fuelcap; //fuel capacity in gallons
	int mpg; //fuel consumption in miles per gallon
	
	Vehicle(int p, int f, int m)
	{
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	//Return the range.
	int range()
	{
		return mpg * fuelcap;
	}
	
	//Computer fuel needed for a given distance.
	double fuelneeded(int miles)
	{
		return (double) miles / mpg;
	}
}



public class VehConsDemo {

	public static void main(String[] args) {
		
		//construct complete vehicles
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportcar = new Vehicle(2,14,12);
		
		double gallons;
		int distance = 252;
		
		gallons = minivan.fuelneeded(distance);
		System.out.println("To go " + distance + " miles minivan needs " + gallons + " gallons of fuel.");
		
		gallons = sportcar.fuelneeded(distance);
		System.out.println("To go " + distance + " miles sportcar needs " + gallons + " gallons of fuel.");

	}

}
