package lecture8;
import java.util.Scanner;
public class EvenNumbersBetween2Numbers {
	public static void printEvenNumbers(int start, int end) {
		if(start%2!=0) { //to check if number is odd, if it is increment it by 1
			start++;
		}
		for(int i=start;i<=end;i+=2) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		printEvenNumbers(start, end);
		s.close();

	}

}
