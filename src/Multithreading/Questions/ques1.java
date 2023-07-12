package Multithreading.Questions;

class practice extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Thankyou");
		}
	}
}

class practice2 extends Thread {
	@Override
	public void run() {
		while (true) {
			// sleep method is used for delaying the thread
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Good morning ");
		}
	}
}

public class ques1 {

	public static void main(String[] args) {
		practice a = new practice();
		a.start();
		practice2 b = new practice2();
		b.start();
	}

}
