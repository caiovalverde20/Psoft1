package Models;

import java.util.Random;

public class Product {
    private String id;
    private String name;
    private String manufacturer;
    private Random random;

    public Product(String name, String manufacturer){
        this.random = new Random();
        this.id = Integer.toString(random.nextInt());
        this.name = name.toLowerCase();
        this.manufacturer = manufacturer.toLowerCase();
    }

    public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	public String toString() {
		return "Product ID: " + getId() + "\nName: " + getName() + "\nManufacturer: " + getManufacturer();
	}
}
