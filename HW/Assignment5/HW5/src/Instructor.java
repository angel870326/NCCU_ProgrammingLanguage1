import java.util.ArrayList;

public class Instructor extends Person{
	
	// Instance Variable
	private String department;
	private ArrayList<String> lectureList;
	private ArrayList<Student> studentList;
	
	// Constructor
	public Instructor() {
	}
	public Instructor(int id, String name, String dep) {
		super(id, name);
		this.department = dep;
		lectureList = new ArrayList<String>();
		studentList = new ArrayList<Student>();
	}
	
	// Getter
	public String getDepartment() {
		return department;
	}
	public ArrayList<String> getLectureList() {
		return lectureList;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	// Instance Methods
	public void addLecture(String lecture) {
		lectureList.add(lecture);
	}
	public boolean addStudent(Student stu) {
		if(stu.getTutorName() != null) {
			return false;
		}
		else {
			studentList.add(stu);
			stu.setTutorName(getName());
			return true;
		}
	}
	public String getStudentNameList() {
		String stuList = "";
		if(studentList.size() > 0) {
			stuList = studentList.get(0).getName();
			for(int i = 1; i < studentList.size(); i++) {
				stuList = stuList + ", " + studentList.get(i).getName();
			}
		}
		return stuList;
	}
	public double getStudentAverage() {
		double sum = 0;
		int count = 0;
		for(int i = 0; i < studentList.size(); i++) {
			for(int j = 0; j < studentList.get(i).getGradeList().size(); j++) {
				sum = sum + studentList.get(i).getGradeList().get(j);
				count++;
			}		
		}
		double avg = sum/count;
		return (double)Math.round(avg * 100)/100; 
	}
	@Override
	public String toString() {
		String idStr = "id=" + getId();
		String nameStr = "name=" + getName();
		String depStr = "department=" + getDepartment();

		String lecListStr = "lectureList=";
		if(lectureList.size() > 0) {
			lecListStr = lecListStr + lectureList.get(0);
		}
		if(lectureList.size() > 1) {
			for(int i = 1; i < lectureList.size(); i++)
			lecListStr = lecListStr + ", " + lectureList.get(i);
		}
		
		String stuListStr = "studentList=";
		if(studentList.size() > 0) {
			stuListStr = stuListStr + studentList.get(0).getName();
		}
		if(studentList.size() > 1) {
			for(int i = 1; i < studentList.size(); i++)
			stuListStr = stuListStr + ", " + studentList.get(i).getName();
		}
		
		return String.format("Instructor[%s, %s, %s, %s, %s]", idStr, nameStr, depStr, lecListStr, stuListStr);
	}


}
