package class_concept;

class emp {
	 private int id;
	 private String name;
	  
	 
	public String getName() {
		 return name;
	 }
	public int getId() {
		return id ;
	}
	public void setName(String n) {
		name=n;
	}
	public void setId(int x) {
		id=x;
	}
	
}

public class access_modifier {

	public static void main(String[] args) {

		emp e = new emp();
//		e.name("yash"); these throws error due to private access modifier 
//		e.id=12;
		e.setName("Yash");
		System.out.println(e.getName());
		
		
		
		
	}

}
