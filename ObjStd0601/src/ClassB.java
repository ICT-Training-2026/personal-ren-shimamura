/**
 * テスト用 ClassB（サブクラス）
 * @author M.Takahashi
 */
public class ClassB extends ClassA {
	/**
	 * methodY（オーバーライド）
	 */
	@Override
	public void methodY() {
		System.out.println("-ClassB-methodY");
	}

	/**
	 * methodZ
	 */
	public void methodZ() {
		System.out.println("-ClassB-methodZ");
	}
}