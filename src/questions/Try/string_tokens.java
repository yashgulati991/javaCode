package questions.Try;

public class string_tokens {

	public static void main(String[] args) {

//		String str = "He is a very very good boy, isn't he?";
		String str = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
		String delims = "[ '.,?!]+";
		String[] tokens = str.split(delims);
		System.out.println(tokens.length);
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
