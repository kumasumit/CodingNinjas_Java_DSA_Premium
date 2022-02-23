package lecture6;
import java.util.Scanner;
public class InvertedTraingle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int cols = 1;
			while(cols<=n-rows+1) {
				System.out.print('*');
				cols++;
			}
			System.out.println();
			rows++;
			s.close();
			
		}

	}

}
