package abstract_class_and_interfaces.PracticSet;

abstract class telephone {
	abstract void ring();

	abstract void lift();

	abstract void disconnect();
}

class SmartTelephone extends telephone {

	@Override
	public void ring() {

		System.out.println("smartphone is ringing");
	}

	@Override
	public void lift() {

		System.out.println("smartphone is lifting");
	}

	@Override
	public void disconnect() {
		System.out.println("smartphone is disconnecting");

	}

}

public class ques_3 {

	public static void main(String[] args) {
		// so polymorphism can be seen by below:

		telephone l = new SmartTelephone();

	}

}
