package basic;

public class recusrsion {
	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

	public static void main(String[] args) {

		int c = factorial(5);
		System.out.println(c);
	}

}
`