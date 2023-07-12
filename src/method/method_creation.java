package method;

public class method_creation {

	public static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	public static void main(String[] args) {
		int a = 34;
		int b = 45;
		int c = 0;
		c = add(a, b);
		System.out.println(c);
	}

}
