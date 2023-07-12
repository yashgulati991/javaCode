package collections;

import java.util.ArrayList;

public class arraylist {
//read all methods from java doc 14 over browser 
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		b.add(23);
		b.add(34);
		a.add(2);
		a.add(3);
		a.add(45);
		a.addAll(0, b);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.print(a.contains(23));
	}

}
