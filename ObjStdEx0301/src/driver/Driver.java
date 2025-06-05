package driver;

import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		SpecialProduct prod = new SpecialProduct();
		prod.setName("キーボード");
		prod.setPrice(3600);
		prod.setOrgPrice(4500);
		
		prod.display();
		prod.displayOrgPrice();

	}

}
