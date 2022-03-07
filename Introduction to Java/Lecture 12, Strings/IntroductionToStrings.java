//Strings stores characters in form of array. Strings act as wrapper above the character Array
public class IntroductionToStrings
{
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.length()); //outputs 0 because there is 0 space between "".
        String str1 = " ";
        System.out.println(str1.length()); //outputs 1 because there is 1 space between the " ".
        String str2 = "Coding";
        System.out.println(str2.length()); //outputs 6 length of Coding
        //str[0], str[1], str[2] gives error
        System.out.println(str2.charAt(1)); //ouputs o 
        System.out.println(str2.charAt(0)); //outputs C
    }
}