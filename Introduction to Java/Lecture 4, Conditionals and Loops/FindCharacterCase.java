/*Find Character Case

Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet
Input format 
Single Character
Output format 
1 or 0 or -1
Constraints 
Input can be any character
Sample Input 1 
v
Sample Output 1 
0
Sample Input 2 
V
Sample Output 2 
1
Sample Input 3 
#
Sample Output 3 
-1
*/

//Solution
import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println("0");
		}else if(ch>='A' && ch<='Z') {
			System.out.println("1");
		}else {
			System.out.println("-1");
		}
		s.close();
		
      
	}

}
