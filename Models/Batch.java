package Models;

import java.util.Date;
import java.time.LocalDateTime;
import java.util.Random;

public class Batch {
    private String id;
    private Product product;
    private Date manufactureDate;
    private Date expirationDate;
    private int amount;
    private Random random;
 
    public Batch(Product product, int amount){
        this.random = new Random();
        this.product = product;
        this.id = Integer.toString(random.nextInt());
        //this.date = date;
        this.amount = amount;
        
    }

    public String getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public int getAmount() {
		return amount;
	}

	public Date getmanufactureDate() {
		return manufactureDate;
	}

	public Date getExpirationDatee() {
		return expirationDate;
	}

	public String toString() {
		return "Batch ID: " + getId() + "\nProduto: " + getProduct().getName() + "\nCapacity of " + getAmount() + " items";
	}
}
