package method_questions;
import java.util.*;
public class table {
 
	static void tab(int x) {
		for(int i=1;i<=10;i++) {
			System.out.format("%d x %d =%d\n",x,i,x*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter the no");
		int n =sc.nextInt();
		tab(n);

	}

}
