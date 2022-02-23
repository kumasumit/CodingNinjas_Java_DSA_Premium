package lecture5;
import java.util.Scanner;
public class ReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rows = 1;
		while(rows<=n) {
			int cols = 1;
			int itemToPrint = n;
			while(cols<=n) {
				System.out.print(itemToPrint); //you can also n-j+1 and it will n-cols+1
				itemToPrint--;
				cols++;
			}
			System.out.println();
			rows++;
			
		}
		s.close();

	}

}
