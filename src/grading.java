import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *  Class that will implement on of the data structures for our project 
 *  @author Kevin Rodriguez and Harsh Gandhi
 */
public class Grading {
	public static void main(String args[]) {
		// instantiate our data structures 
		GradeQueue grades = new GradeQueue();
		ArrayListStudent arrayListStudent = new ArrayListStudent();
		ArrayListAssignment assignments = new ArrayListAssignment();
		System.out.println("What is the name of the file you want to grade?");
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		File file = new File("./" + fileName);
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(file);

		} catch (FileNotFoundException e) {
			System.out.println("File " + file.getName() + " was not found");
			System.exit(1);
		}
		// will add assignments to the grades queue
		while (fileInput.hasNextLine()) {
			Assignment assignment = new Assignment(fileInput.nextLine());
			grades.add(assignment);
		}
		int gradeList;
		// allows the user to add in grades until there is nothing left to grade
		while (grades.size() != 0) {
			Assignment print = grades.poll();
			System.out.println(print.getAssignmentName());
			System.out.println("which grade would you like to give this assignment?");
			gradeList = input.nextInt();
			print.setGrade(gradeList);
			assignments.add(print);
		}
		// will write to the text file and add the grades and assignments to the file
		System.out.println("You have no more assignments to grade!!");
		try (PrintWriter printWriter = new PrintWriter(new File(file.getName()))) {
			for (int i = 0; i < assignments.size(); i++) {
				printWriter.println(assignments.get(i).getAssignmentName());
				printWriter.println(assignments.get(i).getGrade());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
			System.exit(1);

		}

	}
}
