
import java.util.Scanner;
public class CheckPrimality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		int div = 2; // we start from 2 because 1 and 2 are anyway prime. 
		//case 1
//		while(div<n) {
//			if(n%div==0) {
//				isPrime=false;
//				break;
//			}
//			div = div+1;
//		}
		//case 2, optimzed Version
//		while(div<=n/2) {  //because factors appear in pairs
//			if(n%div==0) {
//				isPrime=false;
//				break;
//			}			
//			div = div+1;		
//		}
		//case 3, more optimized version
		while(div*div<=n) {  //here we check only till sqrt(n)
			if(n%div==0) {
				isPrime = false;
				break;  //if it divided even once dont check any further, break out of the loop. 
			}
			div = div+1;
		}
		if(isPrime) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
      s.close();
	}

}
