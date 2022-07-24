import java.util.Scanner;

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
