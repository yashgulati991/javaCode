package questions.construcors_ques;

class cylinder {
	private int radius;
	private int height;

//	public cylinder(int radius, int height) {
//		super();
//		this.radius = radius;
//		this.height = height;
//	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

class rectangle {
	private int length;
	private int breadth;

	public rectangle() {

		this.length = 4;
		this.breadth = 5;
	}

	public rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	

}

public class ques1 {

	public static void main(String[] args) {
		cylinder x = new cylinder();
		x.setHeight(100);
		//System.out.println(x.getHeight());
		
		
		rectangle r =new rectangle(12,34);
System.out.println(r.getLength());
System.out.println(r.getBreadth());

	}

}
