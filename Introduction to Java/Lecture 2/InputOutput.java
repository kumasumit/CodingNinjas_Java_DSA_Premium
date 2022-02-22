
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a= s.nextInt(); //to take integer as input
		System.out.println(a);
		String str = s.next(); //to take first word as input.
		System.out.println(str);
		String str1 = s.nextLine(); //to take entire line as Input.
		System.out.println(str1);
		s.close();
		
	}

}
