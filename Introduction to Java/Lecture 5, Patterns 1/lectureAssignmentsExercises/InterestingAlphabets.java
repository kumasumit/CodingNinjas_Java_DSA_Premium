/*Code : Interesting Alphabets

Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/




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
