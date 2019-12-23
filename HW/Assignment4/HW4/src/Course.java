
public class Course {
	// Instance variable
	private int courseID;
	private String courseName;
	private int credits;
	private int capacity;
	private int enrolled;
	
	// Constructor
	public Course() {		
	}
	public Course(int id, String name, int credits, int capacity) {
		this.courseID = id;
		this.courseName = name;
		this.credits = credits;
		this.capacity = capacity;
		this.enrolled = 0;
	}
	
	// Setter
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setEnrolled(int enrolled) {
		this.enrolled = enrolled;
	}
	
	// Getter
	public int getCourseID() {
		return courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getCredits() {
		return credits;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getEnrolled() {
		return enrolled;
	}
	
	// Instance method
	@Override
	public String toString() {
		return courseID + " " + courseName + " " + credits + " " + enrolled + "/" + capacity;
	}
	

}
