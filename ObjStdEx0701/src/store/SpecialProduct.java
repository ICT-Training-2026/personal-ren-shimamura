package store;

public class SpecialProduct extends AbsProduct{
	private int  orgPrice;
	
	public SpecialProduct(String name,int Price, int orgPrice) {
		super(name,Price);
		this.orgPrice = orgPrice;
	}
	
	@Override
	public void display() {
		System.out.println(super.getNameAndPrice()+"(定価：" + orgPrice + "円)");
	}

}
