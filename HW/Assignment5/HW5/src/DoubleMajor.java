
public class DoubleMajor extends Student {
	
	// Instance Variable
	private String major2;
	
	// Getter
	public String getMajor2() {
		return major2;
	}
	
	// Constructor
	public DoubleMajor() {		
	}
	public DoubleMajor(int id, String name, String major, int enYear, String major2) {
		super(id, name, major, enYear);
		this.major2 = major2;
	}	
	
	// Instance Method
	@Override
	public String toString() {
		String idStr = "id=" + getId();
		String nameStr = "name=" + getName();
		String majorStr = "major=" + getMajor();
		String major2Str = "major2=" + getMajor2();
		String tutorStr = "tutorName=" + getTutorName();
		String enYearStr = "enrolledYear=" + getEnrolledYear();
		
		String gradeListStr = "gradeList=";
		if(getGradeList().size() > 0) {
			gradeListStr = gradeListStr + getGradeList().get(0);
		}
		if(getGradeList().size() > 1) {
			for(int i = 1; i < getGradeList().size(); i++)
			gradeListStr = gradeListStr + ", " + getGradeList().get(i);
		}
		
		return String.format("DoubleMajor[%s, %s, %s, %s, %s, %s, %s]", idStr, nameStr, majorStr, major2Str, tutorStr, enYearStr, gradeListStr);
	}

}
