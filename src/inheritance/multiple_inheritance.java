package inheritance;

interface mycamera {
	void takesnap();

	void recordvideo();

}

interface mywifi {
	String[] getNetwork();

	void connectToNetwork(String network);
}

class myCellPhone {
	void callNumber(int number) {
		System.out.println("calling" + number);
	}

	void pickNumber() {
		System.out.println("connecting...");
	}

}

class mySmartPhone extends myCellPhone implements mywifi, mycamera {
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

public class multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// in java multiple inheritance is not supported 
		mySmartPhone ms = new mySmartPhone();
		String[] ar = ms.getNetwork();
		for (String item : ar) {
			System.out.println(item);

		}
	}

}
