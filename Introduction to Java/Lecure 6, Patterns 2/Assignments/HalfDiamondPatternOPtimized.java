/*Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/
package lecture6.Assignments;
import java.util.Scanner;
public class HalfDiamondPatternOPtimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("*"); //for 1st star
		//first half
		int currRow = 1;
		while(currRow <= n) {
			System.out.print("*"); //first star
			int currCol = 1;
			//for increasing numbers
			while(currCol <= currRow) {
				System.out.print(currCol);
				currCol += 1;
				
			}
			//for decreasing numbers
			currCol = currCol - 2;
			while(currCol>=1) {
				System.out.print(currCol);
				currCol -= 1;
				
			}
			System.out.println("*");
			currRow += 1;
		}
		//for 2nd Half
		currRow = 1;
		while(currRow<=n-1) {
			System.out.print("*");
			int currCol = 1;
			//for increasing numbers
			while(currCol <= n-currRow) {
				System.out.print(currCol);
				currCol++;
			}
			//for decreasing numbers
			currCol = currCol - 2;
			while(currCol >= 1) {
				System.out.print(currCol);
				currCol -= 1;
			}
			System.out.println("*");
			currRow += 1;
			
		}
		System.out.print("*");
		s.close();
	}
}
