package string;

import java.io.*;
import java.util.*;

public class string_compression {
	public static String compression1(String str) {
		String s = str.charAt(0) + "";
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			if (curr != prev) {
				s = s + curr;

			}

		}
		return s;

	}

	public static String compression2(String str) {
		String s = str.charAt(0) + "";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			if (curr == prev) {
				count++;

			} else {
				if (count > 1) {
					s = s + count;
					count = 1;
				}
				s += curr;
			}

		}
		if (count > 1) {
			s = s + count;
			count = 1;
		}
		return s;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
