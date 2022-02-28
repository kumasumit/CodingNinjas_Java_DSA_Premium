package lecture8;
import java.util.Scanner;
public class FactorialNumber {
	public static int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result = factorial(n);
		System.out.println(result);
		s.close();

	}

}
