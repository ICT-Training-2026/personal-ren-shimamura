package company;

/**
 * 営業部員クラス
 * @author M.Takahashi
 */
public class SalesEmployee extends Employee {
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
		super(id, name);
		this.salesAmt = salesAmt;
	}

	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 */
	public SalesEmployee(int id, String name) {
		this(id, name, 0);
	}

	/******** メソッド ********************************************/
	/*--------------------getter/setter--------------------*/
	/**
	 * フィールド salesAmt の値をゲットする
	 * @return salesAmt
	 */
	public int getSalesAmt() {
		return salesAmt;
	}

	/**
	 * フィールド salesAmt の値をセットする
	 * @param salesAmt セットする salesAmt
	 */
	public void setSalesAmt(int salesAmt) {
		if (0 <= salesAmt) {
			this.salesAmt = salesAmt;
		} else {
			System.out.println("\n-->マイナスは設定できません。0を設定します。");
			this.salesAmt = 0;
		}
	}

	/*--------------------通常メソッド--------------------*/
	/**
	 * 売上げる
	 * @param amt	売上金額
	 * @return		処理後の売上合計金額
	 */
	public int sell(int amt) {
		return salesAmt += amt;
	}

	/**
	 * 返品を受け付ける
	 * @param amt	返品金額（売上マイナス）
	 * @return		処理後の売上合計金額
	 */
	public int refund(int amt) {
		return salesAmt -= amt;
	}
	
	/**
	 * 売上金額表示
	 */
	public void displaySalesAmt() {
		System.out.println("売上：" + salesAmt + "円");
	}
	
	/**
	 * 情報表示（オーバーライド）
	 */
	@Override
	public void displayInfo() {
		super.displayInfo();
		displaySalesAmt();
	}
}
