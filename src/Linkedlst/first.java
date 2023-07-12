package Linkedlst;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node() {
		data = 0;
		next = null;
	}

	Node(int d, Node n) {
		data = d;
		next = n;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

class Linkedlist {
	private int size;
	private Node start;

	public Linkedlist() {
		size = 0;
		start = null;
	}

	public boolean isEmpty() {
		if (start == null) {
			return true;
		} else {
			return false;
		}
	}

	public int getListSize() {
		return size;
	}

	public void viewList() {
		Node t = null;
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			t = start;
			for (int i = 1; i <= size; i++) {
				System.out.println(" " + t.getData());
				t = t.getNext();
			}
		}
	}

	public void insertAtFirst(int val) {
		Node n = new Node();
		n.setData(val);
		n.setNext(start);
		start = n;
		size++;
	}

	public void insertAtLast(int val) {
		Node n, t;
		n = new Node();
		n.setData(val);
		t = start;
		if (t == null) {
			start = n;
		} else {
			while (t.getNext() != null) {
				t = t.getNext();
				t.setNext(n);
				size++;
			}
		}
	}

	public void insertAtPos(int val, int pos) {
		if (pos == 1) {
			insertAtFirst(val);
		} else if (pos == size + 1) {
			insertAtLast(val);
		} else if (pos > 1 && pos <= size) {
			Node t;
			Node n = new Node(val, null);
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
				n.setNext(t.getNext());
				t.setNext(n);
			}

		} else {
			System.out.println("Insertion not possible ");
		}
	}

	public void deleteAtLast() {
		if (start == null) {
			System.out.println("List is already empty");
		} else if (size == 1) {
			start = null;
			size--;

		} else {
			Node t;
			t = start;
			for (int i = 1; i <= size - 1; i++) {
				t = t.getNext();
			}
			t.setNext(null);
			size--;

		}
	}

	public void deleteAtPos(int pos) {
		if (start == null) {
			System.out.println("List is already empty");
		} else if (pos < 1 && pos > size) {
			System.out.println("Invalid position");
		} else if (pos == 1) {
			deleteAtFirst();
		} else if (pos == size) {
			deleteAtLast();
		} else {
			Node t, t1;
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
				t1 = t.getNext();
				t.setNext(t1.getNext());
				size--;
			}
		}
	}

	public void deleteAtFirst() {
		if (start == null) {
			System.out.println("List is already empty");
		} else {
			start = start.getNext();
			size--;
		}

	}

	// code for getting only the node not the data
	private Node getNodeAt(int idx) {
		Node temp = start;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// Code to reverse linked list through data iterative approach
	public void reverseDI() {
		int li = 0;
		int ri = size - 1;
		while (li < ri) {
			Node left = getNodeAt(li);
			Node right = getNodeAt(ri);
			int temp = left.data;
			left.data = right.data;
			right.data = temp;

			li++;
			ri--;
		}
	}

	// It returns the mid of a linked list
	public int mid() {
		Node slow = start;
		Node fast = start;
		if (start == null) {
			System.out.println("LiSt Is eMpTy");
		} else {

			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

		}
		return slow.data;
	}

// For Merging two sorted list 
	public static Linkedlist mergeTwoSortedList(Linkedlist l1, Linkedlist l2) {
		Node one = l1.start;
		Node two = l2.start;
		Linkedlist res = new Linkedlist();
		while (one != null && two != null) {
			if (one.data < two.data) {
				res.insertAtLast(one.data);
				one = one.next;
			} else {
				res.insertAtLast(two.data);
				two = two.next;
			}
		}
		while (one != null) {
			res.insertAtLast(one.data);
			one = one.next;
		}
		while (two != null) {
			res.insertAtLast(two.data);

			two = two.next;
		}

		return res;
	}

}

public class first {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Linkedlist lst = new Linkedlist();
		/*
		 * boolean flag = true; while (flag) {
		 * System.out.println("<><><><><><><><><><><><><><><><>");
		 * System.out.println("1-->Insert at First");
		 * System.out.println("2-->Insert at Last");
		 * System.out.println("3-->Insert at Pos");
		 * System.out.println("4-->Delete at First");
		 * System.out.println("5-->Delete at Pos");
		 * System.out.println("6-->Delete at last");
		 * System.out.println("7-->View List"); System.out.
		 * println("8-->Reverse a linked list through data iterative approach");
		 * System.out.println("9-->Exit");
		 * System.out.println("10-->Print the mid of this list");
		 * System.out.println("<><><><><><><><><><><><><><><><>");
		 * System.out.println("Enter your choice"); int choice = sc.nextInt(); int
		 * position, val; switch (choice) { case 1: {
		 * System.out.println("Entre the value"); val = sc.nextInt();
		 * lst.insertAtFirst(val); break; } case 2: {
		 * System.out.println("Enter the value"); val = sc.nextInt();
		 * lst.insertAtLast(val); break; } case 3: {
		 * System.out.println("Enter the position "); position = sc.nextInt();
		 * System.out.println("Enter the value for that position"); val = sc.nextInt();
		 * lst.insertAtPos(val, position); break; } case 4: { lst.deleteAtFirst();
		 * break; } case 5: { System.out.println("Enter the position"); position =
		 * sc.nextInt(); lst.deleteAtPos(position); break; } case 6: {
		 * lst.deleteAtLast(); break; } case 7: { lst.viewList(); break; } case 8: {
		 * lst.reverseDI(); System.out.println("!!LINKEDLIST REVERSED!!");
		 * System.out.println("-------------------"); break; } case 9: { flag = false;
		 * System.out.println("ThankYou!! Closed"); break; } case 10: {
		 * System.out.println("Mid of this linkedlist is-->>>> " + lst.mid()); break; }
		 * default: System.out.println("Invalid Choice "); } }
		 */

	}
}
