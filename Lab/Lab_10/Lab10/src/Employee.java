
public class Employee {
	// Instance variable
	private int empID;
	private String dep;
	private int wage;
	// Constructor
	public Employee() {
		
	}
	public Employee(int id, String dep, int wage) {
		this.empID = id;
		this.dep = dep;
		this.wage = wage;
	}
	// Getter and setter
	public int getEmpID() {
		return empID;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	// Instance methods
	@Override
	public String toString() {
		String idStr = "ID: " + empID;
		String depStr = "Department: " + dep;
		String wageStr = "Wage: " + wage;
		return idStr + "\n" + depStr + "\n" + wageStr;
	}

}
