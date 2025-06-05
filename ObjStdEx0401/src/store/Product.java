package store;

public class Product {
	private String name;
	private int price;
	
	public Product(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(String name) {
		this(name,0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int up(int amt) {
		return price += amt;
	}
	
	public int down(int amt) {
		return price -= amt;
	}
	
	public void display() {
		System.out.println(name+":"+price+"円");
	}
}
