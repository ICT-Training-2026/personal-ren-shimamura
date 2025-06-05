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
		// サブクラスのインスタンス化・メソッド呼び出し
		ClassB b = new ClassB();
		System.out.println();
		b.methodX();				// スーパークラスのメソッド
		b.methodY();				// サブクラスでオーバーライドしたメソッド
		b.methodZ();				// サブクラスのメソッド
		
		// アップキャスト・メソッド呼び出し
		ClassA a = b;
		System.out.println();
		a.methodX();				// スーパークラスのメソッド
		a.methodY();				// サブクラスでオーバーライドしたメソッド
//		a.methodZ();				//（アクセスできる範囲外）

		// ダウンキャスト・メソッド呼び出し
		if (a instanceof ClassB) {
			ClassB b2 = (ClassB) a;
			System.out.println();
			b2.methodX(); // スーパークラスのメソッド
			b2.methodY(); // サブクラスでオーバーライドしたメソッド
			b2.methodZ(); // サブクラスのメソッド
		}
	}
}
