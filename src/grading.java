import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class grading {
	public static void main(String args[]) {
		gradeQueue grades = new gradeQueue(); 
		ArrayListStudent arrayListStudent = new ArrayListStudent();
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
		while (fileInput.hasNextLine()) {
			Assignment assignment = new Assignment(fileInput.nextLine());
			grades.add(assignment);
		}
		for(int i = 0; i < grades.size(); i++) {
			Assignment print = grades.getAssignmentName();
			System.out.println(print);
		}
		
		
	}
}
