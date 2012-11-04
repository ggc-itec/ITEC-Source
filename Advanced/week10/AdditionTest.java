package week10;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {

		Addition addition = new Addition();
		assertEquals(2, addition.add(1, 1));
		assertEquals(22, addition.add(11, 11));

	}

	@Test
	public void testAdd() {
		Addition addition = new Addition();
		assertEquals(2, addition.add(1, 2));
	}

}
