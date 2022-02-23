/*
Code : Alpha Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/
package lectureAssignmentsExercises;

import java.util.Scanner;
public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while (rows <= n) {
			int cols = 1;
			while (cols <= rows) {
				char colValue = (char) ('A' + rows - 1);
				System.out.print(colValue);
				cols++;
			}
			System.out.println();
			rows++;
		}
		s.close();

	}

}
