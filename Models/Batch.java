package Psoft1.Models;

import java.util.Date;
import java.time.LocalDateTime;
import java.util.Random;

public class Batch {
    private String id;
    private Product product;
    private Date date;
    private int amount;
    private Random random;
 
    public Batch(Product product, Date date, int amount){
        this.random = new Random();
        this.id = Integer.toString(random.nextInt());
        this.date = date;
        this.amount = amount;
        
    }
}
