/*Code : Triangular Star Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****
Sample Input 2:
6
Sample Output 2:
*
**
***
****
*****
******
*/





package lectureAssignmentsExercises;

import java.util.Scanner;
public class TriangularStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while (rows <= n) {
			int cols = 1;
			while (cols <= rows) {
				System.out.print("*");
				cols++;
			}
			System.out.println();
			rows++;

		}
		s.close();

	}

}
