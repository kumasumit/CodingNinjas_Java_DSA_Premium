package lecture6;
import java.util.Scanner;
public class IsoscelesTrainglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int numbers = 1;
			int spaces = 1;
			//while loop for spaces
			while(spaces <= n-rows) {
				System.out.print(' ');
				spaces++;
			}
			//while loop for increasing part
			while(numbers<=rows) {
				System.out.print(numbers);
				numbers++;
			}
			//while loop for decreasing part
			int dec = rows-1;
			while(dec>=1) {
				System.out.print(dec);
				dec--;
			}
			
			System.out.println();
			rows++;
		}
		s.close();

	}

}
