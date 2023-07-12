package inheritance;

interface sampleInterface {
	void meth1();

	void meth2();
}

interface childSampleInterface extends sampleInterface {
	void meth3();

	void meth4();
}

class MySampleClass implements childSampleInterface {
	@Override
	public void meth1() {
		System.out.println("Meth1");
	}

	@Override
	public void meth2() {
		System.out.println("Meth2");
	}

	@Override
	public void meth3() {
		System.out.println("Meth3");
	}

	@Override
	public void meth4() {
		System.out.println("Meth4");
	}
}

public class inheritnace_in_interface {

	public static void main(String[] args) {

	}

}
