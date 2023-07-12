package Multithreading;

class mythr extends Thread {
	public mythr(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("I am a thread");
		}
	}
}

public class constructor_thr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythr th = new mythr("qwerty");
		th.start();
	}
	// also u know by making this u can set the priorties as min, max,normal

}
