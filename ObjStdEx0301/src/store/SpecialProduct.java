package store;

public class SpecialProduct  extends Product{
	private int orgPrice;

	public int getOrgPrice() {
		return orgPrice;
	}

	public void setOrgPrice(int orgPrice) {
		this.orgPrice = orgPrice;
	}
	
	public void displayOrgPrice() {
		System.out.println("定価:"+orgPrice+"円");
	}
}
