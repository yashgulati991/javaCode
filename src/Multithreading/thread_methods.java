package Multithreading;

class mynewthr1 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Thankyou");
		}
	}

}

class mynewthr2 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Thankyou");
		}
	}

}

public class thread_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mynewthr1 a = new mynewthr1();
		mynewthr1 b = new mynewthr1();
		a.start();
		try {
			a.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		b.start();
	}

}
