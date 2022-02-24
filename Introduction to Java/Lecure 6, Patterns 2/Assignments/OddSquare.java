/*Odd Square

Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/

package lecture6.Assignments;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int currRows = 1;
		while (currRows <= n) {
			int printValue = 2*currRows -1;
			int currCol = 1;
			while(currCol<=n) {
				System.out.print(printValue);
				printValue = printValue + 2;
				if(printValue > 2*n -1) {
					printValue = 1;
				}
				currCol++;
			}
			System.out.println();
			currRows++;
		}
		s.close();

	}

}
