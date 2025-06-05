package company;

/**
 * 営業部員クラス
 * @author M.Takahashi
 */
public class SalesEmployee extends AbsEmployee implements ExtPrintable {
	/******** フィールド ******************************************/
	/**
	 * 売上合計金額
	 */
	private int salesAmt;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 * @param salesAmt フィールド salesAmt への設定値
	 */
	public SalesEmployee(int id, String name, int salesAmt) {
		super(id, name, "営業部");
		this.salesAmt = salesAmt;
	}

	/******** メソッド ********************************************/
	/**
	 * 情報表示
	 */
	@Override
	public void displayInfo() {
		super.displayBasic();
		System.out.println("売上：" + salesAmt + "円");
	}
	/**
	 * 印刷処理（ExtPrintable インタフェースのメソッドをオーバーライド）
	 */
	@Override
	public void print() {
		super.displayBasic();
		System.out.println("--> 請求書を印刷しました。");
	}

}
