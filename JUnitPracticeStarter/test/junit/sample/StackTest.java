package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class StackTest {
	private Stack<String> stack;
	public String anElement = "要素1";

	@BeforeEach
	public void SetUp() {
		stack = new Stack<>();
	}
	
	@Nested
	public class st0 {

		@Test
		public void isEmpty() {
			stack = new Stack<>();
			assertTrue(stack.isEmpty());
		}

		@Test
		public void throwsExceptionWhenPopped() {
			stack = new Stack<>();
			assertThrows(EmptyStackException.class, () -> stack.pop());
		}
	}

	@Nested
	public class st1 {
		@Test
		public void isNotEmpty() {
			stack = new Stack<>();
			stack.push(anElement);
			assertFalse(stack.isEmpty());
		}

		@Test
		public void returnElementWhenPopped() {
			stack = new Stack<>();
			stack.push(anElement);
			assertEquals(anElement, stack.pop());
		}
	}

}
