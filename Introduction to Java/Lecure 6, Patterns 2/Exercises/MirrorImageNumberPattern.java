/*Code : Mirror Image Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
     1 
    12
   123
Sample Input 2:
4
Sample Output 2:
      1 
     12
    123
   1234
*/


package lecture6.Exercises;
import java.util.Scanner;
public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int numbers = 1;
			int spaces = 1;
			while(spaces <= n-rows) {
				System.out.print(' ');
				spaces++;
			}
			while(numbers<=rows) {
				System.out.print(numbers);
				numbers++;
			}
			System.out.println();
			rows++;
		}
		s.close();

	}

}
