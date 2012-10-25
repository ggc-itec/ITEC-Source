package week09;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CounterTest {

	private Counter counter;
	
	@Before
	public void setUp() throws Exception {
		counter = new Counter();
	}

	@Test
	public void testCounter() {
		counter.increment();
		counter.increment();
		counter.increment();
		assertEquals(counter.getCounter(), 3);
	}
	
	@Test
	public void testFib() {
		assertEquals(Counter.fib(3),1);
	}

}
