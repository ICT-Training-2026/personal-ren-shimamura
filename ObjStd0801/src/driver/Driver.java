package driver;

import company.AbsEmployee;
import company.AccountingEmployee;
import company.ExtPrintable;
import company.HrEmployee;
import company.LogisticEmployee;
import company.PlanningEmployee;
import company.SalesEmployee;
import company.Shippable;

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
		// 配列の作成（抽象クラス型）
		AbsEmployee[] emp = makeEmployeeList();
		
		// 各社員の情報表示
		System.out.println("\n******** 社員情報 ********");
		displayEmployeeList(emp);
		
		// 印刷対象の抽出
		ExtPrintable[] prtEmp = getExtPrintable(emp);
		
		// 対象者全員分の印刷処理
		System.out.println("\n******** 印刷処理 ********");
		printAll(prtEmp);
		
		// 出荷作業の対象の抽出
		Shippable[] shipEmp = getShippable(emp);
		
		// 対象者全員分の出荷処理
		System.out.println("\n******** 出荷処理 ********");
		shipAll(shipEmp);
	}
	
	/**
	 * 配列の作成（抽象クラス absEmployee 型）
	 * @return 作成した配列
	 */
	static AbsEmployee[] makeEmployeeList() {

		AbsEmployee[] emp = {
			new SalesEmployee(1234, "速水剛留", 1000000),
			new PlanningEmployee(3333, "佐藤三郎", 10, 2),
			new AccountingEmployee(5555, "山本誠", "賃金計算"),
			new LogisticEmployee(7777, "西田健一", 2800000, 3300000),
			new HrEmployee(9999,"安藤優人", "採用")
		};
		
		return emp;
	}
	
	/**
	 * 各社員情報の表示
	 * @param absEmployee
	 */
	static void displayEmployeeList(AbsEmployee[] absEmployee) {
		for (int i = 0; i < absEmployee.length; i++) {
			System.out.println();
			absEmployee[i].displayInfo();  
		}
	}

	/**
	 * 印刷対象の抽出
	 * @param abs 社員オブジェクト配列
	 * @return 印刷対象オブジェクト配列（要素がNull以降は対象外）
	 */
	static ExtPrintable[] getExtPrintable(AbsEmployee[] abs) {
		ExtPrintable[] prtEmp = new ExtPrintable[abs.length];
		int pCnt = 0;
		for (int i = 0; i < abs.length; i++) {
			if (abs[i] instanceof ExtPrintable) {
				prtEmp[pCnt] = (ExtPrintable) abs[i];
				pCnt++;
			}
		}
		
		return prtEmp;
	}

	/**
	 * 対象者全員分の印刷処理
	 * @param prt 印刷対象オブジェクト配列（要素がNull以降は対象外）
	 */
	static void printAll(ExtPrintable[] prt) {
		for (int i = 0; i < prt.length; i++) {
			if (prt[i] == null) {
				break;
			}
			System.out.println();
			prt[i].print();
		}
	}

	/**
	 * 出荷作業の対象の抽出
	 * @param abs 社員オブジェクト配列
	 * @return 出荷作業の対象オブジェクト配列（要素がNull以降は対象外）
	 */
	static Shippable[] getShippable(AbsEmployee[] abs) {
		Shippable[] ship = new Shippable[abs.length];
		int sCnt = 0;
		for (int i = 0; i < abs.length; i++) {
			if (abs[i] instanceof Shippable) {
				ship[sCnt] = (Shippable) abs[i];
				sCnt++;
			}
		}
		
		return ship;
	}
	
	/**
	 * 対象者全員分の出荷処理
	 * @param shipEmp 出荷作業の対象オブジェクト配列（要素がNull以降は対象外）
	 */
	static void shipAll(Shippable[] ship) {
		for (int i = 0; i < ship.length; i++) {
			if (ship[i] == null) {
				break;
			}
			System.out.println();
			ship[i].ship();
		}

	}

}
