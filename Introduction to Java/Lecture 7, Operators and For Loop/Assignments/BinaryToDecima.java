/*
Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/

package lecture7.Assignments;
import java.util.Scanner;
public class BinaryToDecima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int decimalNumber = 0;
	        int placeValue = 1;
	        while(n>0){
	            int lastDigit = n%10;
	            decimalNumber = decimalNumber + lastDigit*placeValue;
	            placeValue = placeValue * 2;
	            n=n/10;
	        }
	        System.out.println(decimalNumber);

	        s.close();

		

	}

}
