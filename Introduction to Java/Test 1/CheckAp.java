//Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
/*
6
2 6 10 14 18 22 true
6
2 6 10 15 19 23 false
*/

package test1;
import java.util.Scanner;

public class CheckAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
	        int firstNumber = s.nextInt();
	        int prevNumber = s.nextInt();
	        int d = prevNumber - firstNumber;
	        int count = 2;
	        boolean isAP = true;
	        while(count<n){
	            int current = s.nextInt();
	            if((current-prevNumber)!=d){
	                isAP = false;
	                break;

	            }else{
	                prevNumber = current;
	            }
	            count++;
	        }
	        if(isAP){
	        System.out.println("true");
	        }else{
	            System.out.println("false");
	        }
	        
	        s.close();

	}

}
