
public class Tester {

	public static void main(String[] args) {
		
		Person person = new Person(123, "Leon");
		Instructor ins1 = new Instructor(111, "Jennifer", "MIS"); 
		ins1.addLecture("OOPI");
		ins1.addLecture("OOPII");
		
		Student stu1 = new Student(789, "Simon", "MIS", 107);
		stu1.addGrade(85); 
		stu1.addGrade(95);
		
		DoubleMajor stu2 = new DoubleMajor(456, "David", "MIS", 106, "STAT");
		stu2.addGrade(93); 
		stu2.addGrade(98);
				
		System.out.println(ins1.addStudent(stu1)); 
		System.out.println(ins1.addStudent(stu2)); 
		System.out.println(ins1.addStudent(stu1));
		
		System.out.println(person.toString()); 
		System.out.println(ins1.toString()); 
		System.out.println(stu1.toString()); 
		System.out.println(stu2.toString()); 
		System.out.println("-----------------------"); 
		System.out.println(ins1.getStudentNameList()); 
		System.out.println(ins1.getStudentAverage());
	}

}
