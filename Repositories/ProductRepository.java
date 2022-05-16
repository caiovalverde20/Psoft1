package Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Models.Product;

public class ProductRepository {

    private Map<String,Product> products;
    
    public ProductRepository() {
		this.products = new HashMap<String,Product>();
	}
	
	public void addProduct(Product p) {
		products.put(p.getId(), p);
	}
	
	public void deleteProduto(String id) {
		products.remove(id);
	}
	
	public void editProduct(Product p) {
		products.replace(p.getId(), p);
	}
	
	public Product getProduto(String id) {
		return products.get(id);
	}
	
	public ArrayList<Product> listProducts() {
		ArrayList<Product> list = new ArrayList<Product>();
		
		for(Product product: products.values()) {
			list.add(product);			
		}
		
		return list;
	}
}
