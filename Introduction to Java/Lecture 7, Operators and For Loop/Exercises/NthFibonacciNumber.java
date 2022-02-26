/*
Nth Fibonacci Number

Nth term of fibonacci series F(n) is calculated using following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
Input Format :
Integer n
Output Format :
Nth Fibonacci term i.e. F(n)
Constraints:
1 <= n <= 25
Sample Input 1:
4
Sample Output 2:
3 
Sample Input 1:
6
Sample Output 2:
8
*/
package lecture7.Exercises;
import java.util.Scanner;
public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int a = 0;
	        int b = 1;
	        int c ;
	        for(int i=0;i<n;i++){ //start the counting from 0 
	            c=a+b;
	            a=b;
	            b=c;
	        }
	        System.out.println(a);
	        s.close();
	}

}
