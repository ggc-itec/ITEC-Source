package week09;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	
	@Test
	public void test() {
		Counter count = new Counter();
		count.increment();
		count.increment();
		assertEquals(count.getCounter(),2);
	}

}
