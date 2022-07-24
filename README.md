# Graphing-And-Grading-System


## What is This? 
<img  src = "Screen Shot 2022-07-23 at 10.02.03 PM.png" width = 400px height = 400px alt = "photo of a graph">

A program teachers would be able to use to keep track of their student's test average. The program is vital for teachers to identify students who are doing well in the class and who are struggling. Two data structures were designed and implemented from scratch: ArrayList and queues. The jmathio.jar and jmathplot.jar libraries were also used (feel free to browse through the repository for the jar file right here!)to read in the input data and present the graph according to the data. Additional components would enable teachers to print multiple students' averages on one graph and see how the overall class performs on the tests. 
<img  src = "Screen Shot 2022-07-23 at 10.02.56 PM.png" width = 400px height = 400px alt = "photo of the grading queue that is coming into play :)">

## How to Use
In order to run this program, you must make sure the jar files that are attached to this repository are added as referenced libariries. To do that using Eclipse, feel free to take a look on adding a jar file by clicking the link <a href = "https://stackoverflow.com/questions/2824515/how-to-add-external-library-properly-in-eclipse" target = "_blank" >here</a>! Make sure you are in the <strong>Main.Java</strong> class to ensure that you are able to properly run the program. The class should look like this:

```java
public class Main {
	public static void main(String args[]) {
		System.out.println("What would you like to choose? Press (1) to Grade assignments and (2) to See test graphs?");
		Scanner input = new Scanner(System.in);
		int wrong = 0;
		while (wrong == 0) {
			int choose = input.nextInt();
			if (choose == 1) {
				Grading.main(null);
				wrong = 1;
			} else if (choose == 2) {
				Graph.main(null);
				wrong = 1;
			} else {
				System.out.println("Please choose a correct option.");
			}
		}
	}
}
```

After locating the class, feel free to mess around with the program by adding your assignments and sample data to display the grades on the graph. Have fun with it :). Hopefully a teacher encounters this program and decides to implement this program to their teaching style! 

## Credits
The program was designed and implemented by me and Harsh Gandhi, a computer Science and Data Science Undergrad at Quinnipiac University.
