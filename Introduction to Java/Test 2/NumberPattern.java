/*
 for n = 5
 
1234554321
1234**4321
123****321
12******21
1********1

 */



package test2;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = n;
		while(rows>=1) {
			//code to print increasing numbers
			for(int cols=1;cols<=rows;cols++) {
				System.out.print(cols);
			}
			//code to print stars
			int starsCount = (n-rows)*2;
			for(int i=1;i<=starsCount;i++) {
				System.out.print("*");
			}
			//code to print decreasing numbers
			int printValue = rows;
			for(int i=1;i<=rows;i++) {
				System.out.print(printValue);
				printValue--;
			}
			System.out.println();
			rows--;
		}
		s.close();
				

	}

}
