package class_concept;

class emp1 {
	private int id;
	private String name;

	public emp1() {
		id = 34;
		name = "your-name";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setId(int x) {
		this.id = x;
	}

}

public class constructor {

	public static void main(String[] args) {
		emp1 x = new emp1();
		System.out.println(x.getName());
		System.out.println(x.getId());

	
	}

}
