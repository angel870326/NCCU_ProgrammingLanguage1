
public class Tester10 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Marketing", 30000);
		System.out.println(employee1.toString());
		System.out.println("---------");
		Supervisor supervisor1 = new Supervisor(111, "Marketing", 50000, "Marketing");
		System.out.println(supervisor1.toString());
	}

}
