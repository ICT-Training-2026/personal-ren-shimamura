package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void testTaxPrice() {
		Calculator cal = new Calculator();
		int actual = cal.taxPrice(100);
		int expect  = 110;
		assertEquals(expect, actual);
	}
	
	public void testTaxPriceException() {
		Calculator cal = new Calculator();
		assertThrows(IllegalArgumentException.class,()->cal.taxPrice(-100));
		
	}

}
