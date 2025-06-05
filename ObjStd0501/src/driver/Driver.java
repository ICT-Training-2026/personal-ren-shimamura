package driver;

import company.Employee;
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
		Employee tanaka = new Employee(1000, "田中五郎");
		System.out.println();
		tanaka.displayInfo();
		
		// インスタンス化・情報表示
		SalesEmployee hayami = new SalesEmployee(1234, "速水剛留", 1000000);
		System.out.println();
		hayami.displayInfo();
	}
}

