package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {
	public static void main(String[] args) {
		AbsProduct[] prod = makeProductList();
		System.out.println("---商品リスト---");
		displayProductList(prod);
		
		System.out.println("---配送可能---");
		Deliverable[] deliv = getDelivarable(prod);
		displayDelivlist(deliv);
		
	}
	
	//int型のprice
	//AbsProduct[]型のmakeProductList()
	//AbsProduct[]型のprod[]
	public static AbsProduct[] makeProductList(){
		AbsProduct[] prod = {
				new LimitedProduct("マウス", 2000, 10),
				new SpecialProduct("特価キーボード",3600, 4500),
				new LimitedProduct("webカメラ", 3900, 7),
				new NormalProduct("マイク", 2800),
				new SpecialProduct("ディスプレイ", 15000, 27000),
				new NormalProduct("LED照明", 4200)
		};
		return prod;
	}
	
	public static void displayProductList(AbsProduct[] absProd) {
		for(int i = 0;i<absProd.length;i++) {
			absProd[i].display();
		}
	}
	
	public static Deliverable[] getDelivarable(AbsProduct[] absProd) {
		Deliverable[] deliv = new Deliverable[absProd.length];
		int cnt = 0;
		
		for(int i =0;i<absProd.length;i++) {
			if (absProd[i] instanceof Deliverable) {
				deliv[cnt]=(Deliverable)absProd[i];
				cnt ++;
			}
		}
		return deliv;
	}
	
	public static void displayDelivlist(Deliverable[] deliv) {
		for (int i = 0;i<deliv.length;i++) {
			if(deliv[i]!=null) {
				deliv[i].displayDeliv();
			}
		}
	}
	
}
