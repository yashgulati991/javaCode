package class_concept;

//question 2
class cellphone {
	void ring() {
		System.out.println("Your phone is ringing ");

	}

	void vibrate() {
		System.out.println("your phoneis vibrating ");
	}
}

//question 3 
class square {
	int side;

	public int area() {
		return side * side;
	}

	int perimeter() {
		return 4 * side;
	}
	void printd() {
		System.out.println(area());
		System.out.println(perimeter());
	}
}
//Question 5 
class tommy{
	void hit() {
		System.out.println("htting ");
	}
	void fire() {
		System.out.println("firing");
		
	}
	void run() {
		System.out.println("running");
	}
}
public class ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cellphone a = new cellphone();
//		a.ring();
//		a.vibrate();
		 square s= new square();
		 s.side=11;
		 s.printd();
		 tommy x= new tommy();
		 x.fire();
		 x.run();
	}
}
