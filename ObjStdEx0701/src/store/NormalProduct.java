package store;

public class NormalProduct extends AbsProduct{
	
	public NormalProduct(String name,int price) {
		super(name, price);
	}
	
	@Override
	public void display() {
		System.out.println(super.getNameAndPrice());
	}
}
