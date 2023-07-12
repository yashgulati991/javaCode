package questions.Interview_ques_;

import java.util.Scanner;

public class array_add {
// {1,2,3,4}={1,3,5,10}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int arr2[] = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j <= i; j++) {
				arr2[i] = arr[j] + arr2[i];
			}
			System.out.println(arr2[i]);
		}
	}
}
