package method_questions;

import java.util.Scanner;

public class pattern1 {

	static void pat(int x) {
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines to print");
		int n = sc.nextInt();
		pat(n);
//        int c =recsum(2);
//        System.out.println(c);
	}
//	static int recsum(int n) {
//	if(n==1) {
//		return 1;
//	}
//else {
//	return n+recsum(n-1);}
//}
}
