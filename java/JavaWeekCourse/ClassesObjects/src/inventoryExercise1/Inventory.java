package inventoryExercise1;

/**
 * Manages the products in stock.
 */
public class Inventory {
	private Product[] items;
	private final int maxSize;
	private int size;

	/**
	 * Initializes the inventory
	 *
	 * @param maxSize
	 *            The maximum number of products (units) stored in stock.
	 */
	public Inventory(int maxSize) {
		this.maxSize = maxSize;
		this.items = new Product[maxSize];
		this.size = 0;
	}

	/**
	 * Adds a new product into the inventory.
	 *
	 * @param p
	 *            The product to be added.
	 * @return True if the operation has been completed successfully.
	 */
	public boolean addProduct(Product p) {
		if (size < maxSize) {
			items[size] = p;
			size++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return The the product at the specified index.
	 */
	public Product getProduct(int index) {
		return items[index];
	}

}

