package abstract_class_and_interfaces;

abstract class parent2 {
	parent2() {
		System.out.println("i m constructor of parent2");
	}

	void sayHello() {
		System.out.println("Hello");
	}

	abstract public void greet();
}

class child2 extends parent2 {
	@Override
	public void greet() {
		System.out.println("good morning");
	}
}

abstract class child3 extends parent2 {
	public void th() {
		System.out.println("i m good   ");
	}
}

public class basic_concept {

	public static void main(String[] args) {
		// abstrct means an idea without a concrete existence
		// abstract method-->a method that is declared without an implementation
	}

}
