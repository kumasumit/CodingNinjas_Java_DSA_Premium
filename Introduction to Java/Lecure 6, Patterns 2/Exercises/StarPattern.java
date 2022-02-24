/*Code : Star Pattern

Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
*/ 

package lecture6.Exercises;
import java.util.Scanner;
public class StarPattern {

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
			while(increasing<=rows) {
				System.out.print('*');
				increasing++;
			}
			//3rd decreasing loop
			int decreasing = rows-1;
			while(decreasing>=1) {
				System.out.print('*');
				decreasing--;
			}
			System.out.println();
			rows++;
		}
		s.close();
	}
}
