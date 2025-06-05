package store;

public class SpecialProduct extends Product {
	private int orgPrice;
	
	public SpecialProduct(String name,int price,int orgPrice) {
		super(name,price);
		this.orgPrice = orgPrice;
	}
	
	public SpecialProduct(String name) {
		this(name,0,0);
	}

	public int getOrgPrice() {
		return orgPrice;
	}

	public void setOrgPrice(int orgPrice) {
		this.orgPrice = orgPrice;
	}
	
	public void displayOrgPrice() {
		System.out.println("定価："+orgPrice+"円");
	}
	
	@Override
	public void display() {
		System.out.println(getName()+":"+getPrice()+"円(定価"+orgPrice+"円)");
	}
	
}
