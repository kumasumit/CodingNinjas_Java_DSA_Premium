/*Code : Square Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777
Sample Input 1:
6
Sample Output 1:
666666
666666
666666
666666
666666
666666
*/

package lectureAssignmentsExercises;

import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while (rows <= n) {
			int cols = 1;
			while (cols <= n) {
				System.out.print(n);
				cols++;
			}
			System.out.println();
			rows++;
		}
		s.close();
	}

}
