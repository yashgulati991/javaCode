package class_concept;

class employe {
	int salary;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public int getsalary() {
		return salary;
	}
}

public class ques_1 {

	public static void main(String[] args) {
		employe a = new employe();
		a.setName("yash");
		a.salary=12000;
		System.out.println(a.getsalary());
		System.out.println(a.getName());
	}

}
