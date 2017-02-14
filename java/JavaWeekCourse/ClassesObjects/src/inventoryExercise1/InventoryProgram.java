package inventoryExercise1;

public class InventoryProgram {
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

		// creates and configures another product
		p = new Product(2000, "Paper", 5000, 12.85);

		// adds the new product to the inventory
		inventory.addProduct(p);

		// displays all products in stock
		for (int i = 0; i < inventory.getSize(); i++) {
			p = inventory.getProduct(i);
			System.out.println(p);
		}

	}
}
