package week10;

public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(mystery3(1));
		System.out.println(mystery3(2));
		
		System.out.println();
		mystery3(3);
		System.out.println();
		mystery3(4);
		
	}

	public static int mystery3(int n) {
	    if (n < 0) {
	        return -mystery3(-n);
	    } else if (n < 10) {
	        return n;
	    } else {
	        return mystery3(n / 10 + n % 10);
	    }
	}

	
	public static void mystery2(int n) {
	    if (n <= 1) {
	        System.out.print(n);
	    } else {
	        mystery2(n / 2);
	        System.out.print(", " + n);
	    }
	}

}
