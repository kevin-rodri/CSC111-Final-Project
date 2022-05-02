import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;

public class graph {
	public static void main(String[] args) {
		// create your PlotPanel (you can use it as a JPanel)

		ArrayListAssignment xNums = new ArrayListAssignment();
		ArrayListAssignment yNums = new ArrayListAssignment();
		Plot2DPanel plot = new Plot2DPanel();
		File file = new File("./grades.txt");
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(file);
			plot.setAxisLabel(0, fileInput.nextLine());
			plot.setAxisLabel(1, fileInput.nextLine());
			String in = fileInput.nextLine();

			while (fileInput.hasNextDouble()) {
				double a = fileInput.nextDouble();
				double b = fileInput.nextDouble();
				double c = fileInput.nextDouble();
				double d = fileInput.nextDouble();
				xNums.add(a);
				xNums.add(b);
				xNums.add(c);
				xNums.add(d);

			}
			double[] xNumsArray = new double[xNums.size()];
			double[] yNumsArray = new double[yNums.size()];

			for (int i = 0; i < xNums.size(); i++) {
				xNumsArray[i] = xNums.get(i);
				yNumsArray[i] = yNums.get(i);
			}

			plot.getAxis(0).setLabelPosition(.50, -.1);
			plot.getAxis(1).setLabelPosition(0, 1.05);
			plot.addLegend("SOUTH");
			plot.addLinePlot(in, xNumsArray, yNumsArray);

			JFrame frame = new JFrame("Graph");
			frame.setSize(600, 600);
			frame.setContentPane(plot);
			frame.setVisible(true);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
