package method;

class Phone {
	public void name() {
		System.out.println("My name is this bla-bla");
	}
}

class Smartphone extends Phone {
	@Override
	public void name() {
		System.out.println("my name is this bla-bla in two");
	}
}

public class dynamic_method_dispatch {

	public static void main(String[] args) {
		// this is dynamic method dispatch below;
		Phone p = new Smartphone();// allowed because you can refer to the sub class not super class
		// like see this which is not allowed--Smartphone p= new Phone();
		p.name();// this will print of smartphone beacuse of creating of p for smartphone
	}

}
