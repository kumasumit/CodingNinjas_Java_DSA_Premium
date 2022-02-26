/*
All Prime Numbers

Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/
package lecture7.Exercises;
import java.util.Scanner;
public class AllPrimeNumners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        for(int i=2;i<=n;i++){
	            boolean isPrime = true;
	            for(int j=2;j<i;j++){
	                if(i%j==0){
	                    isPrime=false;
	                    break;
	                }
	            }
	            if(isPrime){
	                System.out.println(i);
	            }
	        }
	     s.close();

	}

}
