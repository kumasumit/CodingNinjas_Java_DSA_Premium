
import java.util.Scanner;

public class InputOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        //Case 1
//        int a = s.nextInt();
//        int b = s.nextInt();
//        System.out.println(a+b); //here when we give 5 15 as input a=5, b=15, and we get 20 as answer.
//        String str = s.next(); //here it takes only one word as input , so if we give Coding Ninjas as Input
//        System.out.println(str); //we get coding as output, because it is first word.
//        
//        //Case 2
//          int a = s.nextInt();
//          String str = s.next();
//          System.out.print(a);
//          System.out.println(str); //for input 10 abc def, output is 10abc
//          
//          //Case 3
//            String str = s.next();
//            int a = s.nextInt();
//            System.out.println(str + " "+ a); 
            //for input abc def 10, ouput is Input Mismatch Exception
            //s.next() scans and returns abc the next token as String.
            //a token is part of entered line that is separated from other tokens by space, newline or tab.
            //So, when Input is "10 abc def " then s.next() returns the first token as string i.e "abc" and
            //s.nextInt() tries to convert the next token "def" into int, which gives Input Mismatch Exception.
            s.close();
        

	}

}
