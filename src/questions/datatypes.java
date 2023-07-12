package questions;
import java.util.*;
public class datatypes {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter the integer");
int n=sc.nextInt();
if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) {
	System.out.println("Can be fitted in\n Byte\n Integer\n Short\n Long");
}
else if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) {
	System.out.println("Can be fitted in\n Integer\n Short\n Long");
}
else if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) {
	System.out.println("Can be fitted in\n   Short\n Long");
}
else if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) {
	System.out.println(Long.MAX_VALUE);
	System.out.println("Can be fitted in\n Long");
}
		

	
	

	}

}
