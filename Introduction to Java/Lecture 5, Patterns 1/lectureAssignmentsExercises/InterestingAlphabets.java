package lectureAssignmentsExercises;

import java.util.Scanner;
public class InterestingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while (rows <= n) {
			int cols = 1;
			char printValue = (char) ('A' + n - rows);
			while (cols <= rows) {
				System.out.print(printValue);
				printValue = (char) (printValue + 1);
				cols++;
			}
			System.out.println();
			rows++;
		}
		s.close();

	}

}
