
import java.util.Scanner;
public class SumofNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum= 0;
		while(i<=n) {
			System.out.println(i); //prints i for every step.
			sum= sum +i;
			i= i+1;
		}
		System.out.println(sum);//prints sum
		s.close();
		

	}

}
