package Multithreading;

class runnable1 implements Runnable {
	@Override
	public void run() {
		int t = 0;
		while (t < 20000) {
			System.out.println("I am a thread 1 not a threat");
		}
	}
}

class runnable2 implements Runnable {

	@Override
	public void run() {
		int x = 0;
		while (x <= 20000) {
			System.out.println("I am a thread 2 not a threat");
		}
	}
}

public class runnable_interface_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnable1 bullet1 = new runnable1();
		Thread gun1 = new Thread(bullet1);
		runnable2 bullet2 = new runnable2();
		Thread gun2 = new Thread(bullet2);
		gun1.start();
		gun2.start();
	}

}
