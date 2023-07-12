package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Get_max_frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the string of characters");
		String s = sc.nextLine();
		HashMap<Character, Integer> h = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (h.containsKey(ch)) {
				int of = h.get(ch);
				int nf = of + 1;
				h.put(ch, nf);
			} else {
				h.put(ch, 1);
			}
		}
		char mfc = s.charAt(0);
		for (Character key : h.keySet()) {
			if (h.get(key) > h.get(mfc)) {
				mfc = key;
			}
		}
		System.out.println(mfc);

	}

}
