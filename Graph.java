import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;

/*
 * Class to implement one of our data structures 
 * @authors Kevin Rodriguez and Harsh Gandhi
 */
public class Graph {
	public static void main(String[] args) {
		// instantiate on our data structure
		ArrayListStudent arrayListStudent = new ArrayListStudent();
		System.out.println("What is the name of the grade file?");
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
		int quit = 0;
		// Configurations to display the user the assignments followed by their grades
		System.out.println("Which student would you like to choose from?, Press 0 to quit.");
		Plot2DPanel plot = new Plot2DPanel();
		plot.setAxisLabel(0, fileInput.nextLine());
		plot.setAxisLabel(1, fileInput.nextLine());
		int number = 1;
		while (fileInput.hasNextLine()) {
			Student student = new Student(fileInput.nextLine());
			arrayListStudent.add(student);
			System.out.println(number + ": " + student.getName());
			number++;
			String assignmentText = fileInput.nextLine();
			String[] split = assignmentText.split(" ");
			for (int i = 0; i < split.length; i += 2) {
				int assignment = Integer.valueOf(split[i]);
				String grade = split[i + 1];
				int finalGrade = Integer.valueOf(grade);
				Assignment assignment5 = new Assignment(assignment, finalGrade);
				student.addAssignment(assignment5);
			}
		}
		// if user wants wants to stop seeing anything, then the frame will disappear
		while (quit == 0) {
			int display = input.nextInt();
			if (display == 0) {
				quit += 1;
				System.exit(1);
			}
			// Storing the results of the students in an array. This is to display the
			// results that will appear on your screen
			Student testStudent = arrayListStudent.get(display - 1);
			double[] x = new double[testStudent.getListOfAssignments().size()];
			double[] y = new double[testStudent.getListOfAssignments().size()];

			for (int i = 0; i < testStudent.getListOfAssignments().size(); i++) {
				x[i] = testStudent.getListOfAssignments().get(i).getAssignment();
				y[i] = testStudent.getListOfAssignments().get(i).getGrade();
			}

			// x axis
			plot.getAxis(0).setLabelPosition(.50, -.1);
			// y axis
			plot.getAxis(1).setLabelPosition(0, 1.05);

			// add a line plot to the PlotPanel
			plot.addLegend("SOUTH");
			plot.addLinePlot(testStudent.getName(), x, y);

			// put the PlotPanel in a JFrame like a JPanel
			JFrame frame = new JFrame("Graph");
			frame.setSize(600, 600);
			frame.setContentPane(plot);
			frame.setVisible(true);

		}
	}
}
