package lecture5CharacterPattern;
import java.util.Scanner;
public class Basicpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int rows = 1;
       while(rows<=n) {
    	   int cols = 1;
    	   char printValue = (char)('A'+rows-1); //first value changes on every row
    	   while(cols<=n) {
    		   System.out.print(printValue);
    		   printValue = (char)(printValue+1);
    		   cols++;
    	   }
    	   System.out.println();
    	   rows++;
       }
       s.close();
	}

}
