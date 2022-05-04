
public class Student {

	private String name;
	private ArrayListAssignment listOfAssignments = new ArrayListAssignment();
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayListAssignment getListOfAssignments() {
		return listOfAssignments;
	}

	public void setListOfAssignments(ArrayListAssignment listOfAssignments) {
		this.listOfAssignments = listOfAssignments;
	}
	
	public void addAssignment(Assignment assignment) {
		this.listOfAssignments.add(assignment);
	}
}
