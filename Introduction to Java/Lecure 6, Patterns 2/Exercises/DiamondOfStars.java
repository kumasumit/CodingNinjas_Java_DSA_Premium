/*Code : Diamond of stars

Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
*/  
package lecture6.Exercises;
import java.util.Scanner;
public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int firstHalf=(n+1)/2;
		int secondHalf = n - firstHalf;
		
		//for 1st half 
	    int currRow = 1;
	    while(currRow<=firstHalf)
	    {	   
	    	//for spaces
	    	int spaces = 1;
	    	while(spaces <= firstHalf-currRow) {
	    		System.out.print(' ');
	    		spaces++;
	    	}
	    	//for stars
	    	int currCol = 1;
	    	while(currCol<=2*currRow-1) {
	    		System.out.print('*');
	    		currCol++;
	    	}
	    	
	    	System.out.println();
	    	currRow++;
	    }
	    currRow=secondHalf;
	    //for 2nd half
	    while(currRow>=1) {
	    	//for spaces
	    	int spaces = 1;
	    	while(spaces<=secondHalf-currRow+1) {
	    		System.out.print(' ');
	    		spaces++;
	    	}
	    	//for stars
	    	int currCol = 1;
	    	while(currCol<=2*currRow-1) {
	    		System.out.print('*');
	    		currCol++;
	    	}
	    	System.out.println();
	    	currRow--;
	    }

		s.close();
		

	}

}
