/*
Compress the String

Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Exmple:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
Note :
Consecutive count of every character in the input string is less than or equal to 9.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
*/
package Assignments;
public class CompressString {
    //coding ninjas solution code
    public static String getCompressedString(String str) {
		// Write your code here.
        int n = str.length();
        if(n==0){ //for empty string
            return str;
        }
        String output = ""+str.charAt(0);
        int currentCharacterCount = 1;
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currentCharacterCount++;
            }else{
                if(currentCharacterCount>1){
                    output = output + currentCharacterCount;
                    currentCharacterCount=1; //reset it to 1
                }
                output += str.charAt(i);
            }
        }
        //to print the character count of last element
        if(currentCharacterCount>1){
            output += currentCharacterCount;
        }
        return output;
	}

    //driver code to check for solution
    public static void main(String[] args) {
        String str = "aaaddd";
        System.out.println(getCompressedString(str)); //a3d3
    
}
}