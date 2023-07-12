package basic;
import java.util.*;
public class last_second {

	public static void main(String[] args) {
		// sorted array =1,2,3,4,5
		//unsorted array =2,6,4,3,9;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int arr[]=new int[n];
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the second last element is: "+arr[n-1]);
		
	}

}
