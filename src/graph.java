import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;

public class graph {
	public static void main(String[] args) {

		ArrayListStudent arrayListStudent = new ArrayListStudent();
		Assignment assignment1 = new Assignment("Lab10", 100);
		Assignment assignment2 = new Assignment("Lab11", 99);
		Student kevin = new Student("Kevin");
		kevin.getListOfAssignments().add(assignment1);
		kevin.getListOfAssignments().add(assignment2);
		arrayListStudent.add(kevin);

		Assignment assignmentHarsh = new Assignment("Lab1", 100);
		Assignment assignmentHarsh2 = new Assignment("Lab2", 99);
		Student harsh = new Student("Harsh");
		harsh.getListOfAssignments().add(assignmentHarsh);
		harsh.getListOfAssignments().add(assignmentHarsh2);
		arrayListStudent.add(harsh);

		for (int i = 0; i < arrayListStudent.size(); i++) {
			System.out.println(arrayListStudent.get(i).getName());
			for (int j = 0; j < arrayListStudent.get(i).getListOfAssignments().size(); j++) {
				System.out.println("\tName: " + arrayListStudent.get(i).getListOfAssignments().get(j).getAssignment());	
				System.out.println("\tGrade: " + arrayListStudent.get(i).getListOfAssignments().get(j).getGrade());	

			}
			
		}
		

		
		// create your PlotPanel (you can use it as a JPanel)
		/*
		 * ArrayListAssignment xNums = new ArrayListAssignment(); ArrayListAssignment
		 * yNums = new ArrayListAssignment(); Plot2DPanel plot = new Plot2DPanel(); File
		 * file = new File("./grades.txt"); Scanner fileInput = null; try { fileInput =
		 * new Scanner(file); plot.setAxisLabel(0, fileInput.nextLine());
		 * plot.setAxisLabel(1, fileInput.nextLine()); String in = fileInput.nextLine();
		 * 
		 * while (fileInput.hasNextDouble()) { double a = fileInput.nextDouble(); double
		 * b = fileInput.nextDouble(); double c = fileInput.nextDouble(); double d =
		 * fileInput.nextDouble(); xNums.add(a); xNums.add(b); xNums.add(c);
		 * xNums.add(d);
		 * 
		 * } double[] xNumsArray = new double[xNums.size()]; double[] yNumsArray = new
		 * double[yNums.size()];
		 * 
		 * for (int i = 0; i < xNums.size(); i++) { xNumsArray[i] = xNums.get(i);
		 * yNumsArray[i] = yNums.get(i); }
		 * 
		 * plot.getAxis(0).setLabelPosition(.50, -.1);
		 * plot.getAxis(1).setLabelPosition(0, 1.05); plot.addLegend("SOUTH");
		 * plot.addLinePlot(in, xNumsArray, yNumsArray);
		 * 
		 * JFrame frame = new JFrame("Graph"); frame.setSize(600, 600);
		 * frame.setContentPane(plot); frame.setVisible(true);
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
	}
}
