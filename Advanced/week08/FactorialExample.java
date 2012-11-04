package week08;

public class FactorialExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println(factorial(22));

	}

	public static long factorial(long n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
