package week10;

public class Number {

	public int factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}

	public int multiplyEvens(int n) {
		if (n <= 0)
			throw new IllegalArgumentException();
		if (n == 1)
			return 2;

		return 2 * n * multiplyEvens(n - 1);
	}
}
