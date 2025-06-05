package store;

public class Product {
    private static final String STORE_NAME = "速水PC販売店";
	private static final int DEFAULT_CHANGE_AMT = 1000;
    private String name;
    private int price;
    
    public Product(String name,int price) {
    	this.name = name;
    	this.price = price;
    }
    
   
    public Product(String name) {
    	this.name = name;
    	this.price = 0;
    }
    
    public static void displayStoreName() {
    	System.out.println("■店舗名："+ STORE_NAME);
    }
    
    public int up(int amt) {
    	return price += amt;
    }
    
    public int up() {
		return price += DEFAULT_CHANGE_AMT;
	}
    
    public int down(int amt) {
    	return price -= amt;
    }
    
    public int down() {
    	return price -= DEFAULT_CHANGE_AMT;
    }
    
    public void display() {
    	System.out.println(name + ":" + price + "円");
    }
}
