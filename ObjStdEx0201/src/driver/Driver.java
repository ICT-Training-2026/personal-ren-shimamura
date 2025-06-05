package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		Product.displayStoreName();
		Product key = new Product("キーボード");
	
		System.out.println("");
		System.out.println("getPrice()の結果："+key.getPrice());
		System.out.println("");
		System.out.println("---再設定後---");
		System.out.println("");
		
		key.setPrice(2800);
		System.out.println("getPrice()の結果："+key.getPrice());

	}

}
