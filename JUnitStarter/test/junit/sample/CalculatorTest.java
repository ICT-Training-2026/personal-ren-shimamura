package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	Calculator cal;
	
	@BeforeEach
	public void setUp(){
		//オブジェクトを生成
		cal = new Calculator();
	}
	
	@Test
	public void testAdd() {
		
		//期待値
		int expected = 5;
		//実測値
		int actual = cal.add(3, 2);
		//比較
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		//期待値
		int expected = 1;
		//実測値
		int actual = cal.sub(3, 2);

		assertEquals(expected, actual);
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
