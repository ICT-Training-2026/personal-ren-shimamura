package store;

public class NormalProduct extends AbsProduct implements Deliverable{
	
	public NormalProduct(String name,int price) {
		super(name, price);
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【通常送料500円】 "+super.getNameAndPrice());
	}
	
	@Override
	public void display() {
		System.out.println(super.getNameAndPrice());
	}
}
