package week09;

/*
 * Counter keeps track of a variable
 * @author dr.im
 * @version 0.1
 */
public class Counter {

	private int i;

	/*
	 * Initializes the counter to 0
	 */
	public Counter() {
		i = 0;
	}
	
	/*
	 * Increments of the counter by 1
	 */
	public void increment() {
		i = i + 1;
	}

	/*
	 * Simple getter method
	 * @return the counter 
	 */
	public int getCounter() {
		return i;
	}
	
	/*
	 * This method should not be here. Why did I put this here!?!
	 * FIXME - 
	 * @param calculate the  
	 * @return the n-th  
	 * @throws IllegalArgumentException is thrown if the argument is less than zero
	 */
	public static int fib(int n) {
		
		if(n<0)
			throw new IllegalArgumentException();
		
		int x=0; 
		int y=1;
		int fib = 0;
		for(int i=0; i<=n; i++) 
		{
			fib = x + y;
			x = y;
			y = fib;
		}
		return fib;
	}

}
