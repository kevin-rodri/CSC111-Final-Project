/*
 * Class contains the student object that will be used in other clases 
 * @author Harsh Gandhi
 */
public class Student {
	// instance of the name of Students
	private String name;
	// instance of the assignments
	private ArrayListAssignment listOfAssignments = new ArrayListAssignment();

	// contructor that will take in a name for a student
	public Student(String name) {
		this.name = name;
	}

	// returns the name of a student
	public String getName() {
		return name;
	}

	// set the name of a student
	public void setName(String name) {
		this.name = name;
	}

	// returns the listOfAssignments array list
	public ArrayListAssignment getListOfAssignments() {
		return listOfAssignments;
	}

	// sets the list of assignments
	public void setListOfAssignments(ArrayListAssignment listOfAssignments) {
		this.listOfAssignments = listOfAssignments;
	}

	// allows the ability to add an assignment to the array list
	public void addAssignment(Assignment assignment) {
		this.listOfAssignments.add(assignment);
	}
}
