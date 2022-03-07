/*
Check Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters.
Palindrome
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Example:
If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.

The expected output for this example will print, 'true'.
From that being said, you are required to return a boolean value from the function that has been asked to implement.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false'.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1 :
abcdcba
Sample Output 1 :
true 
Sample Input 2:
coding
Sample Output 2:
false
*/
package Exercises;
public class StringPalindrome {
    //coding ninjas Solution
    public static boolean isPalindrome(String str) {
		//Your code goes here
        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start)!=str.charAt(end)){
                isPalindrome = false;
                break; //come out of loop
            }else{
                start++; //increase start from i to end
                end--;   //decrease end from end to i
            }
        }
        return isPalindrome; 
	}

    public static boolean isPalindrome1(String str) {
		//Your code goes here
        boolean isPalindrome = false;
        String reversedString = "";
        for(int i=0;i<str.length();i++){
            reversedString = str.charAt(i) + reversedString;
        }
        if(reversedString.equals(str)){
            isPalindrome = true;
        }
        return isPalindrome;
	}
    //driver code to check Solution
    public static void main(String[] args) {
      String str = "abba";
      String str1 = "abcd";
      System.out.println(isPalindrome(str));  //true
      System.out.println(isPalindrome(str1)); //false
      System.out.println(isPalindrome1(str)); //true
      System.out.println(isPalindrome1(str1));//false
    }
}
