package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		Product.displayStoreName();
		Product prod1 = new Product("キーボード",4500);
		Product prod2 = new Product("マウス",2000);
		
		prod1.down();
		prod2.up(500);
		
		System.out.println("");
		prod1.display();
		prod2.display();
		
	}

}
