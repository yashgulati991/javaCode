package questions;

import java.util.Scanner;

class prime{
	void checkprime(int... numbers) {
		for(int i:numbers) {
			if(isprime(i)) {
				System.out.println(i+" ");
			}
			
		}
	}
	
	 boolean isprime(int n) {
	        if (n < 2) {
	            return false;
	        } else if (n == 2) {
	            return true;
	        } else if (n % 2 == 0) {
	            return false;
	        }
	        int sqrt = (int) Math.sqrt(n);
	        for (int i = 3; i <= sqrt; i += 2) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
public class check_prime_byclass {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

	}

}
