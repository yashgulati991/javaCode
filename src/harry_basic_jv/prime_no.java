package harry_basic_jv;
import java.util.*;
public class prime_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no");
        int n =sc.nextInt();
        int temp=0;
        for(int i=2;i<=n-1;i++) {
    	  if(n%i==0) {
    		  temp=temp+1;
    	  }
         }
      if(temp>0) {
    	  System.out.println("not prime");
      }
      else {
    	  System.out.println("prime");
      }
	}

}
