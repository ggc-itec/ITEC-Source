package week10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

	private Number number;
	
	@Before
	public void setUp() throws Exception {
		number = new Number();
	}

	@Test
	public void testFactorial() {
		assertEquals(1, number.factorial(1));
		assertEquals(1, number.factorial(0));
		assertEquals(6, number.factorial(3));
		assertEquals(24, number.factorial(4));

	}

	@Test
	public void testMultiplyByTwo() {
		assertEquals(8, number.multiplyEvens(2));
	}
}
