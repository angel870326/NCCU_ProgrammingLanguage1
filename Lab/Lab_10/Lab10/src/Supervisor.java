
public class Supervisor extends Employee {
	// Instance variable
	private String managing;
	// Constructor
	public Supervisor() {
		
	}
	public Supervisor(int id, String dep, int wage, String managing) {
		super(id, dep, wage);
		this.managing = managing;
	}
	// Getter and setter
	public String getManaging() {
		return managing;
	}
	public void setManaging(String managing) {
		this.managing = managing;
	}
	// Instance methods
	@Override
	public String toString() {
		return super.toString() + "\n" + "In charge of " + managing;
		
	}

}
