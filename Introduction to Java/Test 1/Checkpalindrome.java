//Write a function to check whether a given number is palindrome or not
//if it is 121 answer is true , if  it is 345 answer is false.

package test1;

import java.util.Scanner;

public class Checkpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int reversedNumber = 0;
	        int testNumber = n;
	        while(n>0){
	            int lastDigit = n%10;
	            reversedNumber = reversedNumber *10+ lastDigit;
	            n = n/10;
	        }
	        if(reversedNumber==testNumber){
	            System.out.println("true");

	        }else{
	            System.out.println("false");

	        }
	        s.close();
	}

}
