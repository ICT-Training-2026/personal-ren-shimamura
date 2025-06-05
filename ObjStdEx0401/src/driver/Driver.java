package driver;

import store.SpecialProduct;

public class Driver {
	public static void main(String[] args) {
		SpecialProduct prod = new SpecialProduct("特価キーボード",3600,4500);
		prod.display();
		prod.displayOrgPrice();
	}
}
