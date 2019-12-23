
public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(108306100, "Allen", 15); 
		Student stu2 = new Student(108306101, "Bob"); 
		Course c1 = new Course(306101, "OOPI", 15, 2); 
		Course c2 = new Course(306201, "OOPII", 2, 2);
		stu1.enroll(c1);
		stu2.enroll(c2);
		stu2.enroll(c1);
		stu1.enroll(c2); 
		stu1.drop(306201);
		stu2.drop(c2); 
		System.out.println(stu1.info()); 
		System.out.println("---------"); 
		System.out.println(stu2.info()); 
		System.out.println("---------"); 
		System.out.println(c1.toString()); 
		System.out.println(c2.toString());
	}

}
