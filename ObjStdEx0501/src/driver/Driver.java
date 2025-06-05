package driver;

import store.Product;
import store.SpecialProduct;

public class Driver {
	public static void main(String[] args) {
		Product	 prod = new Product("マウス",2000);
		prod.display();
		
		System.out.println("");
		
		SpecialProduct prod1 = new SpecialProduct("特価キーボード",3600,4500);
		prod1.display();
		
	}

}
