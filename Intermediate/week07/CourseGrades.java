package week07;

public class CourseGrades implements Analyzable {
	// Constant for the number of grades
	public final int NUM_GRADES = 4;

	// Variable to reference a GradedActivity
	// array
	private GradedActivity[] grades;

	/**
	 * Constructor
	 */

	public CourseGrades() {
		// Create the grades array.
		grades = new GradedActivity[NUM_GRADES];
	}

	/**
	 * The setGrade method stores a GradedActivity object for the assignment.
	 * 
	 * @param grade
	 *            Represents the grade.
	 */

	public void setGrade(GradedActivity grade, int assignment) {
		grades[assignment] = grade;
	}

	/**
	 * The toString method returns a string representation of the object.
	 * 
	 * @return A string representation of the object.
	 */

	public String toString() {
		String str = "Lab Score: " + grades[0].getScore() + "\tGrade: "
				+ grades[0].getGrade() + "\nPass/Fail Exam Score: "
				+ grades[1].getScore() + "\tGrade: " + grades[1].getGrade()
				+ "\nEssay Score: " + grades[2].getScore() + "\tGrade: "
				+ grades[2].getGrade() + "\nFinal Exam Score: "
				+ grades[3].getScore() + "\tGrade: " + grades[3].getGrade();

		return str;
	}

	@Override
	public double getAverage() {
		return (grades[0].getScore() + grades[1].getScore()
				+ grades[2].getScore() + grades[3].getScore()) / 4;
	}

	@Override
	public GradedActivity getHighest() {
		// TODO Auto-generated method stub
		// return Math.max( Math.max( grades[0].getScore() ,
		// Math.max( grades[1].getScore(), grades[2].getScore() ),
		// grades[3].getScore() ) );

		return null;
	}

	@Override
	public GradedActivity getLowest() {
		// TODO Auto-generated method stub
		// return Math.min();
		return null;
	}
}
