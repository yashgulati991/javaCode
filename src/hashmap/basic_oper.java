package hashmap;

import java.util.HashMap;
import java.util.Set;

public class basic_oper {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("yash", 499);
		hm.put("dhruv", 809);
		hm.put("sujal", 67);
		hm.put("deepak", 69);
		hm.put("vijay", 456);
		System.out.println(hm);
		System.out.println(hm.get("yash"));
		System.out.println(hm.containsKey("yuvraj"));
		// for only getting keys
		Set<String> s = hm.keySet();
		System.out.println("All keys" + s);

	}

}
