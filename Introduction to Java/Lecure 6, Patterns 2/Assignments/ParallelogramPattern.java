/*Parallelogram Pattern

Write a program to print parallelogram pattern for the given N number of rows.
For N = 4



The dots represent spaces.
Input Format :
 A single integer : N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    *****
*/    
package lecture6.Assignments;
import java.util.Scanner;
public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int colRows = 1;
		while(colRows<=n) {
			int spaces = 1;
			while(spaces<=colRows-1) {
				System.out.print(' ');
				spaces++;
			}
			int stars = 1;
			while(stars<=n) {
				System.out.print('*');
				stars++;
			}
			System.out.println();
			colRows++;
		}
     s.close();
	}
}
