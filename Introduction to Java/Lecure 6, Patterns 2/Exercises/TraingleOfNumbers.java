/*Code : Triangle of Numbers

Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654
*/     
package lecture6.Exercises;
import java.util.Scanner;
public class TraingleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int spaces = 1;
			//1st loop for spaces
			while(spaces<=n-rows) {
				System.out.print(' ');
				spaces++;
			}
			//2nd increasing loop
			int increasing = 1;
			int printValueLeft = rows;
			while(increasing<=rows) {
				System.out.print(printValueLeft);
				printValueLeft++;
				increasing++;
			}
			//3rd decreasing loop
			int decreasing = rows-1;
			int printValueRight = printValueLeft - 2;
			while(decreasing>=1) {
				System.out.print(printValueRight);
				printValueRight--;
				decreasing--;
			}
			System.out.println();
			rows++;
		}
		s.close();
	}
}
