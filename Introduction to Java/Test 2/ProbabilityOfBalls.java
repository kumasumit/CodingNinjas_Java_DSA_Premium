/*
An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. Calculate the probability that out of n drawn balls exactly x balls are red.
Find your answer multiplied by 100 and return the integer part.
All required values for computation will be in integer range.
x is always less than equal to 4 and x is always less than equal to n.
3 1
42
*/

package test2;

import java.util.Scanner;

public class ProbabilityOfBalls {
	public class Solution {

		public static int factorial(int n) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			return fact;
		}

		public static int NCR(int n, int r) {
			int factn = factorial(n);
			int factr = factorial(r);
			int factnr = factorial(n - r);
			return factn / (factr * factnr);

		}

		public static int probability(int n, int x) {

			/*
			 * Your class should be named Solution Don't write main(). Don't read input, it
			 * is passed as function argument. Return output and don't print it. Taking
			 * input and printing output is handled automatically.
			 */
			int favourableOutcome = NCR(4, x) * NCR(4, n - x);
			int totalOutcome = NCR(8, n);
			int ans = (favourableOutcome*100) / totalOutcome;
			return ans;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		System.out.println(Solution.probability(n, x));
		s.close();

	}

}
