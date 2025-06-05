package company;

/**
 * 物流部員クラス
 * @author M.Takahashi
 */
public class LogisticEmployee extends AbsEmployee implements ExtPrintable, Shippable {
	/******** フィールド ******************************************/
	/**
	 * 仕入れ商品原価
	 */
	private int purchaseTotal;

	/**
	 * 出荷商品原価
	 */
	private int deliveryTotal;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param purchaseTotal フィールド purchaseTotal への設定値
	 * @param deliveryTotal フィールド deliveryTotal への設定値
	 */
	public LogisticEmployee(int id, String name, 
							int purchaseTotal, int deliveryTotal) {
		super(id, name, "物流部");
		this.purchaseTotal = purchaseTotal;
		this.deliveryTotal = deliveryTotal;
	}

	/******** メソッド ********************************************/
	/*--------------------通常メソッド--------------------*/
	/**
	 * 情報表示
	 */
	@Override
	public void displayInfo() {
		super.displayBasic();
		System.out.println("仕入れ商品原価：" + purchaseTotal + "円");
		System.out.println("出荷商品原価：" + deliveryTotal + "円");
	}

	/**
	 * 印刷処理（ExtPrintable インタフェースのメソッドをオーバーライド）
	 */
	@Override
	public void print() {
		super.displayBasic();
		System.out.println("--> 納品書を印刷しました。");
	}
	
	/**
	 * 出荷処理（Shippable インタフェースのメソッドをオーバーライド）
	 */
	@Override
	public void ship() {
		super.displayBasic();
		System.out.println("--> 商品を出荷しました。");
	}

}
