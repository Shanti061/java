package inventoryExercise2;

/**
 * Represents a product.
 */
public class Product {
	private int itemNumber;
	private String name;
	private int unitsInStock;
	private double price;

	/**
	 * Default constructor
	 */
	public Product() {
	}

	/**
	 * Handy constructor to initialize all atributes of the product.
	 */
	public Product(int itemNumber, String name, int unitsInStock, double price) {
		this.itemNumber = itemNumber;
		this.name = name;
		this.unitsInStock = unitsInStock;
		this.price = price;
	}

	/**
	 * @return The value of the inventory (the number of units in stock
	 *         multiplied by the price of each unit).
	 */
	public double getValueOfInventory() {
		return this.unitsInStock * this.price;
	}

	/**
	 * @return the itemNumber
	 */
	public int getItemNumber() {
		return itemNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the unitsInStock
	 */
	public int getUnitsInStock() {
		return unitsInStock;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param itemNumber
	 *            the itemNumber to set
	 */
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param unitsInStock
	 *            the unitsInStock to set
	 */
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return A string representation of the product.
	 */
	@Override
	public String toString() {
		return "Item Number: " + itemNumber + "\nName: " + name + "\nPrice: "
				+ price + "\nUnits In Stock: " + unitsInStock
				+ "\nValue of Inventory: " + getValueOfInventory();
	}
}

