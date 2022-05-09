package Psoft1.Models;

import java.util.Random;

public class Product {
    private String id;
    private String name;
    private String manufacturer;
    private Random random;

    public Product(String name, String manufacturer){
        this.random = new Random();
        this.id = Integer.toString(random.nextInt());
        this.name = name;
        this.manufacturer = manufacturer;
    }
}
