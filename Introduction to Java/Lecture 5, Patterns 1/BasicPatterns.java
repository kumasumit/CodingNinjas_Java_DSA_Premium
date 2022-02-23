package lecture5;
import java.util.Scanner;
public class BasicPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int rows=1;
		while(rows<=number) {
			int cols = 1; //reinitialize cols=1 for every row.
			while(cols<=number) {
			 System.out.print("*");
			 cols++;
			}
			System.out.println(); //gives a new line at end of every row
			rows++;
		}
		s.close();
		
		

	}

}
