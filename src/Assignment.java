/*
 * Assignment type to be used throughout the project
 * @author Harsh Gandhi 
 */
public class Assignment {
	// instance of assignment number
	private int assignment;
	// instance of the grade of an assignment
	private int grade;
	// instance of assignment name
	private String name;

	// constrcutor that will take in an assignment number and grade
	public Assignment(int assignment, int grade) {
		this.assignment = assignment;
		this.grade = grade;
	}

	// constrcutor that will take in an assignment name
	public Assignment(String assignment) {
		name = assignment;

	}

	// returns the assignment number
	public int getAssignment() {
		return assignment;
	}

	// returns the name of the assignment
	public String getAssignmentName() {
		return name;
	}

	// sets an assignment at a specific index
	public void setAssignment(int assignment) {
		this.assignment = assignment;
	}

	// returns the grade of a specific assignment
	public int getGrade() {
		return grade;
	}

	// sets a grade for a certain assignment
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
