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
		SalesEmployee kawai = new SalesEmployee("河合彩香");

		System.out.println("\n---インスタンス作成済み---\n");

//		System.out.println("salesAmt参照の結果：" + kawai.salesAmt);
		System.out.println("getSalesAmt()の結果：" + kawai.getSalesAmt());

		kawai.setSalesAmt(500000);
//		kawai.setSalesAmt(-100000);

		// 情報表示
		System.out.println();
		kawai.displayInfo();
	}
}
