package class_concept;
class employee{
	int id;
	String name;
	public void print() {
		System.out.println("My id is "+id);
		System.out.println("My name is "+name);
	}
}
public class custom_class {

	public static void main(String[] args) {
		employee a =new employee();
        a.id=12;
        a.name="yash";
       a.print();
	}

}
