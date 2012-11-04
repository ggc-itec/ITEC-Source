package week10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Recursion2Test {

	private Recursion r;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		r = new Recursion();
	}

	@Test
	public void testMystery1() {
		assertEquals(1, Recursion.mystery3(3));
	}

}
