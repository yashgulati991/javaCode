package inheritance;




//inheritance =it is used to borrow properties and methods from an exsisting class
class Base{
	int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void printme() {
		System.out.println("I am a constructor");
	}
}
//like in this you have to  write same code for multiple times
//sub-class extends superclass
//Java doesn't support multiple inheritance 
class derived extends Base{
	int y;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
}
// example 2
class animal{
	public void walk() {
		System.out.println("animal is walking");
	}
	public void noice() {
		System.out.println("animal is making some noice ");
	}
}
class dog extends animal{
	public void bark() {
		System.out.println("dog is barking");
	}
	
}
public class basic_intro {

	public static void main(String[] args) {
		 
		dog d =new dog();
		d.walk();
		d.noice();
		d.bark();

	}

}
