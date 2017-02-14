package inventoryExercise3;

import java.text.DecimalFormat;

public class InventoryPart3 {
	private static DecimalFormat currency = new DecimalFormat("£#,##0.00");

	public static void main(String[] args) {
		// Create and instantiate a Supplier array (i.e. Supplier products[] =
		// new Supplier[5];)
		Supplier[] products = new Supplier[5];

		// Use the constructor in your Supplier class to create 5 new
		// objects. Note: You will provide the values for the constructor
		// yourself. You will not prompt the user to enter this data.
		// Add the objects created in step 2 to your Supplier array.
		products[0] = new Supplier(500, "Precision", 10, 2000, "Dell");
		products[1] = new Supplier(200, "Spectre 360", 20, 1100, "HP");
		products[2] = new Supplier(300, "Thinkpad Carbon", 15, 1800, "Lenovo");
		products[3] = new Supplier(350, "Titan SLI", 10, 3000, "MSI");
		products[4] = new Supplier(400, "MacBook", 80, 1500, "Apple");

		// Call your sortArray method to sort the Supplier array.
		sortArray(products);

		// Display the following information for EACH item in your array:
		// * the product number;
		// * the name of the product,
		// * the number of units in stock,
		// * the price of each unit;
		// * and the value of the inventory (the number of units in stock
		// multiplied by the price of each unit)
		// * Supplier Name
		// * Restock Fee
		for (int i = 0; i < products.length; i++) {
			Supplier supplier = products[i];
			System.out.printf("Product Number: %s\n", supplier.getItemNumber());
			System.out.printf("Product Name: %s\n", supplier.getProductName());
			System.out.printf("Units in Stock: %d\n", supplier
					.getUnitsInStock());
			System.out.printf("Unit Price: %s\n", currency.format(supplier
					.getPrice()));
			System.out.printf("Value of Inventory: %s\n", currency
					.format(supplier.calculateInventory()));
			System.out
					.printf("Supplier Name: %s\n", supplier.getSupplierName());
			System.out.printf("Restock Fee: %s\n\n", currency.format(supplier
					.calculateRestockFee()));
		}

		// Call your calculateInventory method to display the total value of
		// the inventory (all 5 products) including the Restock Fee.
		double value = calculateInventory(products);
		System.out.printf("The total value of the inventory: %s\n", currency
				.format(value));
	}

	/**
	 * A method to calculate the value of the entire inventory. This method
	 * should take in an array of type Software, Printer or Computer and should
	 * traverse through all the elements of the array and calculate the
	 * inventory.
	 *
	 * @return The value of the entire inventory.
	 */
	public static double calculateInventory(Computer[] products) {
		double value = 0;
		for (int i = 0; i < products.length; i++) {
			value += products[i].calculateInventory();
		}
		return value;
	}

	/**
	 * Sorts the products by name, using the Bubble Sort algorithm.
	 * http://en.wikipedia.org/wiki/Bubble_sort
	 */
	public static void sortArray(Computer[] products) {
		int n = products.length; // size;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				String name1 = products[i].getProductName();
				String name2 = products[i + 1].getProductName();
				if (name1.compareToIgnoreCase(name2) > 0) {
					// swap
					Computer temp = products[i];
					products[i] = products[i + 1];
					products[i + 1] = temp;
					swapped = true;
				}
			}
			n = n - 1;
		} while (swapped);
	}
}
