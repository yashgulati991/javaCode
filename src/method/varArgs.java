package method;

public class varArgs {
//int sum(int a,int b) {
//	return a+b;
//}
static int sum(int ...arr) {
	int result=0;
	for(int a:arr) {
		result+=a;
	}
	return result;
}
	public static void main(String[] args) {
		System.out.println("Hi welcome to varargs");
		varArgs x =new varArgs();
//		int a=34,b=45;
//		int c=x.sum(a, b);
	    System.out.println("The sum of no is " +sum ...arr(1,2,3));
//		System.out.println(c);
	}

}
