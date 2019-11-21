
public class Grading {
	
	/**
	 * The pass mark. (For example, the pass mark for undergraduate school is 60.)
	 */
	private int passMark;
	
	//constructor
	
	/**
	 * Initialize a newly created {@code Grading} object.
	 */
	public Grading() {
		
	}
	
	/**
	 * Construct a grading object with given passMark.
	 * @param passMark the pass mark (For example, the pass mark for undergraduate school is 60.)
	 */
	public Grading(int passMark) {
		this.passMark = passMark;
	}
	
	//setter
	
	/**
	 * Set the passMark.
	 * @param passMark the pass mark
	 */
	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}
	
	/**
	 * Get the passMark.
	 * @return the pass mark
	 */
	public int getPassMark() {
		return passMark;
	}
	
	/**
	 * Convert the grade to the corresponding letter grade and return it.
	 * @param score the score
	 * @return the corresponding letter grade
	 */
	public String toLetterGrade(int score) {
		if(score > 100 || score < 0) {
			return "Out of range";
		}
		else if(score >= 80) {
			return "A";
		}
		else if(score >= 70) {
			return "B";
		}
		else if(score >= 60) {
			return "C";
		}
		else if(score >= 50) {
			return "D";
		}
		else if(score > 0) {
			return "E";
		}
		else{
			return "X";
		}
	}
	
	/**
	 * Calculate the average of the input array and return the average score. (Without 0.)
	 * @param grades the grades
	 * @return the average score
	 */
	public double calculateAvg(int[] grades) {
		int sum = 0;
		int noInput = 0;
		for(int i = 0; i < grades.length; i++) {
			sum += grades[i];
			if(grades[i] == 0) {
				noInput++;
			}
		}
		double avg = (double)sum / (grades.length - noInput);
		return avg;
	}
	
	/**
	 * Return a string that describe the score, the average score, and pass/failed count (Not counting 0.) of the input parameter.
	 * @param grades the grades
	 * @return the summarize of grades
	 */
	public String summarizeGrade(int[] grades) {
		int pass = 0;
		int fail = 0;
		for(int i = 0; i < grades.length; i++) {
			if(grades[i] != 0) {
				if(grades[i] >= getPassMark()) {
					pass++;
				}
				else {
					fail++;
				}
			}			
		}
		return String.format("%11s%.2f\n%6s%d,%9s%d\n", "Avg. Score: ", calculateAvg(grades), "Pass: ", pass, "failed: ", fail);
	}

}
