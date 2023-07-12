package inheritance;

class base1{
	//alt+shift+s =to generate methods like getters and setters
	base1(){
		System.out.println("I am a constructor");
	}
	public int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
    
}
class derived1 extends base1{
	derived1(){
		System.out.println("I am a derived class costructor");
	}
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
public class constructor_in_inheritance {

	public static void main(String[] args) {
		base1 b =new base1();
		derived1 d1= new derived1();// it will print two times one for its own and one for super class

	}

}
