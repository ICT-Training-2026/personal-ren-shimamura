package junit.sample;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator cal;

	@BeforeEach
	public void setUp() {
		//オブジェクトを生成
		cal = new Calculator();
	}

	@Test
	public void testAdd() {
		//ENVの文字列がDEVと同じ：この後の操作も行う
		//違う；この後の操作はスキップ
		assumeTrue("DEV".equals(System.getenv("ENV")));

		//期待値
		int expected = 5;
		//実測値
		int actual = cal.add(3, 2);
		//比較
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		//第一引数の処理が満たされた場合、第二引数の操作を行う
		assumingThat("DEV".equals(System.getenv("ENV")), () -> {

			//期待値
			int expected = 1;
			//実測値
			int actual = cal.sub(3, 2);

			assertEquals(expected, actual);
			System.out.println("(1)テスト実行");
		});
		System.out.println("(2)テスト終了");
	}

	@Test
	public void testMul() {

		//期待値
		int expected = 6;
		//実測値
		int actual = cal.mul(3, 2);

		assertEquals(expected, actual);
	}

	@Nested
	public class DivTest {

		@Test
		public void testDiv() {
			//期待値
			float expected = 1.5f;
			//実測値
			float actual = cal.div(3, 2);

			assertEquals(expected, actual);
		}

		@Test
		//実行構成→包含、除外→includeの中にexceptionなどタグ名を入れる
		@Tag("Exception")
		public void testDivException() {
			assertThrows(IllegalArgumentException.class, () -> cal.div(3, 0));
		}

		@Disabled//以下のメソッドの処理はskipされます。
		@Test
		@Tag("Exception")
		public void testDivException2() {
			try {
				cal.div(3, 0);
				fail();
			} catch (IllegalArgumentException e) {
				assertEquals("第二引数に0が指定されました", e.getMessage());
			}
		}
	}

}
