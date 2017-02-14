package inventoryExercise2;

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

	/**
	 * Sorts the products by name, using the Bubble Sort algorithm.
	 * http://en.wikipedia.org/wiki/Bubble_sort
	 */
	public void sortByName() {
		int n = size;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				String name1 = items[i].getName();
				String name2 = items[i + 1].getName();
				if (name1.compareToIgnoreCase(name2) > 0) {
					// swap
					Product temp = items[i];
					items[i] = items[i + 1];
					items[i + 1] = temp;
					swapped = true;
				}
			}
			n = n - 1;
		} while (swapped);
	}

	/**
	 * @return The value of the entire inventory.
	 */
	public double calculateValue() {
		double value = 0;
		for (int i = 0; i < size; i++) {
			value += items[i].getValueOfInventory();
		}
		return value;
	}
}
