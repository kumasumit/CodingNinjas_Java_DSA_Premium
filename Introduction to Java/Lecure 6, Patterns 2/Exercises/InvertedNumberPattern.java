/*Code : Inverted Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
*/

package lecture6.Exercises;
import java.util.Scanner;
public class InvertedNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int printValue = n-rows+1;
			int cols = 1;
			
			while(cols<=n-rows+1) {
				System.out.print(printValue);
				cols++;
				
			}
			System.out.println();
			rows++;
		}
		s.close();

	}

}
