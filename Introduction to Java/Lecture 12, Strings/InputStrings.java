//how to take Input in Java
import java.util.Scanner;
public class InputStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1,str2,str3;
        str1= s.next(); //input is given as abc def ghi jkl
        System.out.println(str1); //abc is printed //next only takes in next token separated by tab or space.
        str2 = s.next();
        System.out.println(str2); //def is printed
        str3 = s.nextLine();
        System.out.println(str3); //ghi jkl is printed because it prints everything that remains until it sees a newline
        s.close();        
    }
}
