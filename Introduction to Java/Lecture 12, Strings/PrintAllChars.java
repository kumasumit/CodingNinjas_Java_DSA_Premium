//this shows how to iterate over the strngs and print a new character.
import java.util.Scanner;


public class PrintAllChars {
    public static void printAllChars(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = s.nextLine();
        printAllChars(str);
        s.close();
    }
}
