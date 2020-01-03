import java.util.ArrayList;

public class Student extends Person{
	
	// Instance Variable
	private String major;
	private int enrolledYear;
	private ArrayList<Integer> gradeList;
	private String tutorName;
	
	// Constructor
	public Student() {		
	}
	public Student(int id, String name, String major, int enYear) {
		super(id, name);
		this.major = major;
		this.enrolledYear = enYear;
		this.gradeList = new ArrayList<Integer>();
	}
	
	// Getter and Setter
	public String getMajor() {
		return major;
	}
	public int getEnrolledYear() {
		return enrolledYear;
	}
	public ArrayList<Integer> getGradeList() {
		return gradeList;
	}
	public String getTutorName() {
		return tutorName;
	}
	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}
	
	// Instance methods
	public void addGrade(int grade) {
		gradeList.add(grade);
	}
	
	@Override
	public String toString() {
		
		String idStr = "id=" + getId();
		String nameStr = "name=" + getName();
		String majorStr = "major=" + getMajor();
		String tutorStr = "tutorName=" + getTutorName();
		String enYearStr = "enrolledYear=" + getEnrolledYear();
		
		String gradeListStr = "gradeList=";
		if(gradeList.size() > 0) {
			gradeListStr = gradeListStr + gradeList.get(0);
		}
		if(gradeList.size() > 1) {
			for(int i = 1; i < gradeList.size(); i++)
			gradeListStr = gradeListStr + ", " + gradeList.get(i);
		}
		
		return String.format("Student[%s, %s, %s, %s, %s, %s]", idStr, nameStr, majorStr, tutorStr, enYearStr, gradeListStr);
	}
}
