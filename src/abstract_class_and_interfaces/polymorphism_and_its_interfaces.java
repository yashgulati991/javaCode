package abstract_class_and_interfaces;

interface mycamera2 {
	void takesnap();

	void recordvideo();

}

interface mywifi2 {
	String[] getNetwork();

	void connectToNetwork(String network);
}

class myCellPhone2 {
	void callNumber(int number) {
		System.out.println("calling" + number);
	}

	void pickNumber() {
		System.out.println("connecting...");
	}

}

class mySmartPhone2 extends myCellPhone2 implements mywifi2, mycamera2 {
	@Override
	public void takesnap() {
		System.out.println("Taking snap");
	}

	@Override
	public void recordvideo() {
		System.out.println("recording video");
	}

	@Override
	public String[] getNetwork() {
		System.out.println("Getting list of networks");
		String[] networklist = { "1a", "2b", "3c" };

		return networklist;
	}

	@Override
	public void connectToNetwork(String network) {
		System.out.println("connecting to" + network);

	}

}

public class polymorphism_and_its_interfaces {

	public static void main(String[] args) {
		// now from below code u can see that we cannot use other methods instead of
		// camera
		mycamera2 cam1 = new mySmartPhone2();

	}

}
