
public class Person {
	
	// Instance Variable
	private int id;
	private String name;
	
	//Constructor
	public Person() {		
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Getter and Setter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	// Instance Method
	@Override
	public String toString() {
		String idStr = "id=" + id;
		String nameStr = "name=" + name;
		return "Person[" + idStr + ", " + nameStr + "]";
	}
	
	

}
