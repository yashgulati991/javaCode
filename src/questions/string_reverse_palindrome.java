package questions;

import java.util.*;

public class string_reverse_palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		String reverse = "";
		int length = s.length();
		for (int i = length-1; i >=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (s.equals(reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			
	}
		System.out.println(reverse);}

}
