package collections;

import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();
		b.add(23);
		b.add(34);
		a.add(2);
		a.add(3);
		a.add(45);
		a.addAll(0, b);
		// Linkedlist contains most of the methods that arraylist contain but there are
		// more
		// methods that linkelist have like below-->
		a.addLast(89);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		// System.out.print( a.contains(23));

	}

}
