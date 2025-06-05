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
		// インスタンス化・初期値設定
		SalesEmployee hayami = new SalesEmployee();
		hayami.setId(1234);						// スーパークラスのメソッド
		hayami.setName("速水剛留");				// スーパークラスのメソッド
		hayami.setSalesAmt(1000000);			// サブクラスのメソッド
		
		// 情報表示
		System.out.println();
		hayami.displayInfo();					// スーパークラスのメソッド
		hayami.displaySalesAmt();				// サブクラスのメソッド
		
	}
}
