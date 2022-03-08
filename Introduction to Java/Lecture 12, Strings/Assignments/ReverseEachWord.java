/*
Reverse Each Word

Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/

package Assignments;
public class ReverseEachWord {
    //coding ninjas solution code
    //a private function to reverse Each Word
    private static String reverseWord(String str, int start, int end){
        String reverseWord = "";
        while(start<end)
        {
          reverseWord = str.charAt(start) + reverseWord;
          start++;
        }
        return reverseWord;
    }
    public static String reverseEachWord(String str) {
		//Your code goes here
        int n = str.length();
        if(n==0){ //code to check for empty string
            return str;
        }
        int currentStart = 0;
        int i;
        String result = "";
        for(i=0;i<n;i++){
          if(str.charAt(i)==' '){
              int currentEnd = i;
              result = result + reverseWord(str, currentStart, currentEnd) + " ";
              currentStart = i+1;
          }
        }
        //System.out.println(i);
        //for last word
        int currentEnd = i;
        result = result + reverseWord(str, currentStart,currentEnd);
        return result;
	}

    //main driver code to check the solution
    public static void main(String[] args) {
        String str = "Hello sumit";
        System.out.println(reverseEachWord(str)); //olleH timus
    }
    
}
