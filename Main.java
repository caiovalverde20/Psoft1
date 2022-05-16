import Models.*;
import Repositories.*;

public class Main {

    public static void main(String[] args) {



        Product product = new Product("Milk", "Cow");
		Batch batch = new Batch(product,10);
		
		System.out.println(product.toString());
        System.out.println("\n");
		System.out.println(batch.toString());
    }   
}
