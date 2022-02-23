package lecture6;
import java.util.Scanner;
public class MirrorImagePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int stars = 1;
			int spaces = 1;
			while(spaces <= n-rows) {
				System.out.print(' ');
				spaces++;
			}
			while(stars<=rows) {
				System.out.print('*');
				stars++;
			}
			System.out.println();
			rows++;
		}
		s.close();

	}

}
