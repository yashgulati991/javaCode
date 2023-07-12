package basic;

public class palindrome {

	public static void main(String[] args) {
		int n=121,rev=0,rem;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		System.out.println(rev+" ");
		if(rev==temp) {
			System.out.println("palindrome");
		}
		else {
		
		System.out.println("not a palindrome");
		}
	}

}
