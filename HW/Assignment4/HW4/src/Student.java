import java.util.ArrayList;

public class Student {
	// Instance variable
	private int studentID;
	private String studentName;
	private ArrayList<Course> enrolledCourses;
	private int currentCredits;
	private int maxCredits;
	
	// Constructor
	Student(){		
	}
	Student(int studentID, String name){
		this.studentID = studentID;
		this.studentName = name;
		this.currentCredits = 0;
		this.maxCredits = 25;
		this.enrolledCourses = new ArrayList<Course>();
	}
	Student(int studentID, String name, int maxCredits){
		this.studentID = studentID;
		this.studentName = name;
		this.maxCredits = maxCredits;
		this.currentCredits = 0;
		this.enrolledCourses = new ArrayList<Course>();
	}
	
	// Setter
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setCurrentCredits(int currentCredits) {
		this.currentCredits = currentCredits;
	}
	public void setMaxCredits(int maxCredits) {
		this.maxCredits = maxCredits;
	}
	
	// Getter
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public ArrayList<Course> getEnrolledCourses(){
		return enrolledCourses;
	}
	public int getCurrentCredits() {
		return currentCredits;
	}
	public int getMaxCredits() {
		return maxCredits;
	}
	
	// Instance methods
	public Course getCourse(int id) {
		int pos = 0;
		boolean found = false;
		while(pos < enrolledCourses.size() && !found) {
			if(enrolledCourses.get(pos).getCourseID() == id) {
				found = true;
			}
			else {
				pos++;
			}
		}
		if(found) {
			return enrolledCourses.get(pos);
		}
		else {
			return null;
		}		
	}
	public void enroll(Course course) {
		if(course.getEnrolled() == course.getCapacity()) {
			System.out.println(course.getCourseID() + " is full");
		}
		else if(currentCredits + course.getCredits() > maxCredits) {
			System.out.println(studentID + " cannot enroll any course");
		}
		else {
			enrolledCourses.add(course);
			course.setEnrolled(course.getEnrolled() + 1);
			currentCredits = currentCredits + course.getCredits();
		}
	}
	public void drop(int courseID) {
		int pos = 0;
		boolean found = false;
		while(pos < enrolledCourses.size() && !found) {
			if(enrolledCourses.get(pos).getCourseID() == courseID) {
				found = true;
			}
			else {
				pos++;
			}
		}
		if(found) {
			enrolledCourses.get(pos).setEnrolled(enrolledCourses.get(pos).getEnrolled() - 1);
			currentCredits = currentCredits - enrolledCourses.get(pos).getCredits();
			enrolledCourses.remove(pos);
		}
		else {
			System.out.println(studentID + " does not in " + courseID);
		}		
	}	
	public void drop(Course course) {
		if(enrolledCourses.contains(course)) {
			course.setEnrolled(course.getEnrolled() - 1);
			currentCredits = currentCredits - course.getCredits();
			enrolledCourses.remove(course);
		}
		else {
			System.out.println(studentID + " does not in " + course.getCourseID());
		}
	}
	public String info() {
		String id = "Student ID: " + studentID;
		String name = "Name: " + studentName;
		String credit = "Credits: " + currentCredits + "/" + maxCredits;
		String courseList = "Course list\n";
		if(enrolledCourses.size() > 0) {
			courseList =  courseList + enrolledCourses.get(0).getCourseID() + " " + enrolledCourses.get(0).getCourseName() + " " + enrolledCourses.get(0).getCredits();
			for(int i = 1; i < enrolledCourses.size(); i++) {
				courseList = courseList + "\n" + enrolledCourses.get(i).getCourseID() + " " + enrolledCourses.get(i).getCourseName() + " " + enrolledCourses.get(i).getCredits();
			}
		}			
		return id + "\n" + name + "\n" + credit + "\n" + courseList + "\n";
	}

}
