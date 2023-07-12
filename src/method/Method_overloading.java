package method;

public class Method_overloading {

	void hi() {
		System.out.println("Hi my name is x");
	}
	

	public static void main(String[] args) {
		Method_overloading a= new Method_overloading();
    a.hi();
 
	a.bye("yash");
	}
	//method overloading 
	void bye() {
		System.out.println("bye brother");
	}

	void bye(String name) {
		System.out.println("bye " + name);
	}

	
	
}
