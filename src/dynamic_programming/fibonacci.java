package dynamic_programming;

import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int fibn=Fib(n);
System.out.println(Fib(19)+"");
	}
	public static int Fib(int n) {
		 if ((n == 0) || (n == 1))
		      return n;
		   else
		      return Fib(n - 1) + Fib(n - 2);
	}

}
