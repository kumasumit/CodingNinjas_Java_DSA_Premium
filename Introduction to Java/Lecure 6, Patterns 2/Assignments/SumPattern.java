/*Sum Pattern

Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/



package lecture6.Assignments;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int currentRow = 1;
		int sum = 0;
		
		while (currentRow <= n) {
			sum = sum + currentRow;
			int currentCol = 1;
			while(currentCol <= currentRow)
			{
				System.out.print(currentCol);
				if(currentCol == currentRow) {
					System.out.print('=');
				}else {
					System.out.print('+');
				}
				currentCol++;
				
			}
			
			System.out.println(sum);
			currentRow++;
		}
		s.close();

	}

}
