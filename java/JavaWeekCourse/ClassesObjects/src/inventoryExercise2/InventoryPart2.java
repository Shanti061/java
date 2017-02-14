package inventoryExercise2;

public class InventoryPart2 {
	public static void main(String[] args) {
		// creates a new inventory
		Inventory inventory = new Inventory(100);

		// creates and configures a product
		Product p = new Product();
		p.setItemNumber(1000);
		p.setName("Pen");
		p.setPrice(1.25);
		p.setUnitsInStock(50);

		// adds the product to the inventory
		inventory.addProduct(p);

		// creates, configures and adds more products to the inventory
		inventory.addProduct(new Product(2000, "Paper", 5000, 12.85));
		inventory.addProduct(new Product(3000, "Pencil", 100, 6.60));
		inventory.addProduct(new Product(3500, "Brush", 300, 3.00));
		inventory.addProduct(new Product(4000, "Paint", 20, 39.65));
		inventory.addProduct(new Product(5000, "Compass", 55, 0.99));

		// sorts the products
		inventory.sortByName();

		// displays all products in stock
		for (int i = 0; i < inventory.getSize(); i++) {
			p = inventory.getProduct(i);
			System.out.println(p);
			System.out.println();
		}
		
		//use foreach

		// displays the value of the entire stock
		double value = inventory.calculateValue();
		System.out.println("The value of the entire inventory: " + value);
	}
}

