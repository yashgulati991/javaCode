package abstract_class_and_interfaces.PracticSet;

class monkey {
	void jump() {
		System.out.println("Jumping..");
	}

	void bite() {
		System.out.println("Biting..");
	}
}

interface animal {
	void eat();

	void sleep();
}

class human extends monkey implements animal {
	@Override
	public void eat() {
		System.out.println("eating");
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
	}
}

public class ques_2 {

	public static void main(String[] args) {
		human h = new human();
		h.bite();

	}

}
