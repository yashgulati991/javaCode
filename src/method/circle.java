package method;
import java.util.*;
public class circle {

	public static int circle(int x) {
		int area=(int) (3.14*x*x);
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        int r =sc.nextInt();
        System.out.println("The area is "+circle(3));
	}

}
