package driver;

import company.SalesEmployee;

/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// インスタンス化・情報表示
		SalesEmployee hayami = new SalesEmployee(1234, "速水剛留", 1000000);
		System.out.println();
		hayami.displayInfo();					// スーパークラスのメソッド
		hayami.displaySalesAmt();				// サブクラスのメソッド

		// インスタンス化・情報表示
		SalesEmployee kawai = new SalesEmployee(9876, "河合彩香");
		System.out.println();
		kawai.displayInfo();					// スーパークラスのメソッド
		kawai.displaySalesAmt();				// サブクラスのメソッド
	}
}
