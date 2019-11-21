
public class Student {
	
	// instance variable
	
	/** The student ID. */
	private int studentID;
	
	/** The student’s name. */	
	private String name;
	
	/** The department the student belongs to. */
	private String department;
	
	/** An array that can store grades. */	
	private int[] grades;
	
	/** Used as a counter for grades. */	
	private int gradesIndex = 0;
	
	// constructor	
	
	/**
	 * Initialize a newly created {@code Student} object.
	 */
	public Student() {
		
	}
	
	/**
	 * Construct a student object with given student id, name, and department, and an empty array of grades.
	 * @param studentID the student ID
	 * @param name the student's name
	 * @param department the department the student belongs to
	 */
	public Student(int studentID, String name, String department) {
		this.studentID = studentID;
		this.name = name;
		this.department = department;
		this.grades = new int[5];
		this.gradesIndex = 0;
	}
	
	// setter
	
	/**
	 * Set the studentID.
	 * @param studentID the student ID
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	/**
	 * Set the name.
	 * @param name the student's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set the department.
	 * @param department the department the student belongs to
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// getter
	
	/**
	 * Get the studentID.
	 * @return the student ID
	 */
	public int getStudentID() {
		return studentID;
	}
	
	/**
	 * Get the name.
	 * @return the student’s name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the department.
	 * @return the department the student belongs to
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * Get the grades.
	 * @return an array that can store 5 grades
	 */
	public int[] getGrades() {
		return grades;
	}
	
	/**
	 * Get the gradesIndex.
	 * @return the index in grades
	 */
	public int getGradesIndex() {
		return gradesIndex;
	}
	
	
	// other instance methods
	
	/**
	 * Get the value in grades by specific index.
	 * @param idx the index in grades
	 * @return the grade by specific index
	 */	
	public int getGrade(int idx) {
		return this.grades[idx];
	}
	
	/**
	 * If gradesIndex is in valid range, add a new grade to grades at gradesIndex and gradesIndex + 1. If the index is out of bound, that is gradesIndex is 5 or greater, print an error message “Array index out of bounds”.
	 * @param grade a new grade
	 */
	public void addGrade(int grade) {
		if(this.gradesIndex < grades.length) {
			this.grades[this.gradesIndex] = grade;
			this.gradesIndex++;
		}
		else {
			System.out.println("Array index out of bounds");
		}
	}
	 
	/**
	 * Update the value in grades at given index. (Suppose idx is in valid range)
	 * @param idx the index in grades
	 * @param grade the grade at given index
	 */
	public void updateGrade(int idx, int grade) {
		this.grades[idx] = grade;
	}
	
	/**
	 * Return a formatted String that describe the information about the student.
	 * @return the student ID, name, department, and grades
	 */
	public String info() {
		String gradesStr = String.format("%-5d", getGrade(0));
		for(int i = 1; i < grades.length; i++) {
			String gradeI = Integer.toString(getGrade(i));
			gradesStr = gradesStr + gradeI + "  "; 
		}
		String info = String.format("%11s%9d\n%12s%9s\n%11s%9s\n%12s%-25s", "Student ID: ", getStudentID(), "Name: ", getName(), "Department: ", getDepartment(), "Grades: ", gradesStr);
		return info;
	}
	
	
	

}
