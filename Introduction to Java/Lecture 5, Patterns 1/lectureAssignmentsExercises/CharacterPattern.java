/*
 * Code : Character Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK
*/
package lectureAssignmentsExercises;
import java.util.Scanner;
public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int rows = 1;
	        while(rows<=n){
	            int cols = 1;
	            char printValue = (char)('A'+rows-1);
	            while(cols<=rows){
	                System.out.print(printValue);
	                printValue = (char)(printValue+1);
	                cols++;
	            }
	            System.out.println();
	            rows++;
	        }
	        s.close();		

	}

}
