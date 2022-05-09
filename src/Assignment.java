
public class Assignment {
	private int assignment;
	private int grade;
	private String name;
	public Assignment(int assignment, int grade)
	{
		this.assignment = assignment;
		this.grade = grade;
	}
	public Assignment(String assignment)
	{
		name = assignment;
		
	}
	
	public int getAssignment() {
		return assignment;
	}
	public String getAssignmentName() {
		return name;
	}
	public void setAssignment(int assignment) {
		this.assignment = assignment;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	
}
