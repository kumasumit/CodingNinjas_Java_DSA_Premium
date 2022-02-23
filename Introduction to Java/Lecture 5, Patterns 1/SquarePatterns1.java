package lecture5;
import java.util.Scanner;
public class SquarePatterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int cols = 1;
			while(cols<=n) {
				System.out.print(cols);
				cols++;
			}
			System.out.println();
			rows++;
			
		}
		s.close();
	}

}
