package lecture5traingularpatterns;
import java.util.Scanner;
public class BasicPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		int printValue = 1;
		while(rows<=n) {
			int cols = 1;
			while(cols<=rows) {
				System.out.print(printValue);
				printValue++;
				cols++;
				
			}
			System.out.println();
			rows++;
		}
		s.close();

	}

}
