package basic;
import java.util.*;
public class Fib_bsc {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0,b=1,c=0,n;
	System.out.println("Enter the no");
	n=sc.nextInt();
	System.out.println(a+" "+b);
	for(int i=2;i<=n;i++) {
		c=a+b;
		System.out.println(" "+c);
		a=b;
		b=c;
	}

	}

}
