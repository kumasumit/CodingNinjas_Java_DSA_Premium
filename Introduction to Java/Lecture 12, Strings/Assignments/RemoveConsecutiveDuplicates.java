/*
Remove Consecutive Duplicates

For a given string(str), remove all the consecutive duplicate characters.
Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx
*/

package Assignments;
public class RemoveConsecutiveDuplicates {
    //coding ninjas solution
    public static String removeConsecutiveDuplicates(String str) {
        int n = str.length();
        if(n==0){ //to handle the case of empty string
            return str;
        }
        String answer = ""; //we create answer string to store the output.
        int startIndex = 0;
        while(startIndex < n){
            char UniqueChar = str.charAt(startIndex);
            int nextUniqueChar = startIndex + 1;
            while(nextUniqueChar<n && str.charAt(nextUniqueChar)==UniqueChar){
                nextUniqueChar++;
            }
            answer = answer + UniqueChar;
            startIndex = nextUniqueChar;
        }
        return answer;
    }
    //main driver code to check the solution
    public static void main(String[] args) {
        String str = "aaaabbbaa";
        System.out.println(removeConsecutiveDuplicates(str)); //aba
    }
}
