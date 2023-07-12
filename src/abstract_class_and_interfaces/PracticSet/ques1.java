package abstract_class_and_interfaces.PracticSet;

abstract class pen {
	abstract void write();

	abstract void refill();
}

class fountainPen extends pen {
	@Override
	public void write() {
		System.out.println("writing ...");
	}

	@Override
	public void refill() {
		System.out.println("refilling...");
	}

	void changeNib() {
		System.out.println("Changing the Nib");
	}
}

public class ques1 {

	public static void main(String[] args) {
		fountainPen fp = new fountainPen();
		fp.changeNib();
	}

}
