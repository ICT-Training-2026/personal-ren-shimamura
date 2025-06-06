package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class BusinessDayServiceTest {
	private final BusinessDayService service = new BusinessDayService();

	@Test
	public void testIsBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022,10,20));
		
		assertTrue(actual);
	}
	
	@Test
	public void testHolidayNotBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022,11,3));
		
		assertFalse(actual);
	}
	
	@Test
	public void testSaturdayIsNotBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022, 12, 17));
		
		assertFalse(actual);
	}
	
	@Test
	public void testSundayIsNotBusinessDay() {
		boolean actual = service.isBusinessDay(LocalDate.of(2022, 12, 25));
		
		assertFalse(actual);
	}
	
	@Test
	public void testgetNxtBusinessDayIsNull() {
		LocalDate actual = service.getNextBusinessDay(LocalDate.of(2022, 8, 11), 5);
		assertNull(actual);
	}
	
	@Test
	public void testGetNextBusinessDay() {
		LocalDate actual = service.getNextBusinessDay(LocalDate.of(2022, 9, 23), 5);
		assertNotNull(actual);
		assertEquals(actual, LocalDate.of(2022, 9, 26));
	}
	
	@Test
	public void testGetBusinessDayArray() {
		LocalDate[] actual = service.getBusinessDayArray(LocalDate.of(2022, 10, 7), 5);
		LocalDate[] expect = {
				LocalDate.of(2022, 10, 7),
				LocalDate.of(2022, 10, 11),
				LocalDate.of(2022, 10, 12)
		};
		assertArrayEquals(expect, actual);				
	}
	
	@Test
	public void testGetBusinessDayList() {
		List<LocalDate> actual = service.getBusinessDayList(LocalDate.of(2022, 10, 7), 5);
		List<LocalDate> expect = Arrays.asList(
				LocalDate.of(2022, 10, 7),
				LocalDate.of(2022, 10, 11),
				LocalDate.of(2022, 10, 12));
	
		assertIterableEquals(expect, actual);
	}
}