package questions;

import java.util.*;

public class string_ques_1 {

//	Input Format
//
//	The first line contains a stringA . The second line contains another stringB . The strings are comprised of only lowercase English letters.
//
//	Output Format
//
//	There are three lines of output:
//	For the first line, sum the lengths of A and .B
//	For the second line, write Yes if  Ais lexicographically greater thanB  otherwise print No instead.
//	For the third line, capitalize the first letter in bothA  and B and print them on a single line, separated by a space.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// enter the strings in lowercase only
		System.out.println("ENter the string a");
		String A = sc.nextLine();
		System.out.println("ENter the string b");
		String B = sc.nextLine();
		System.out.println(A.length() + B.length());
	System.out.println(A.compareTo(B)>0? "Yes": "No");
	System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));

	}

}
