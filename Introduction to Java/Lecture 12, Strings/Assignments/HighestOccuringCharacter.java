/*
Highest Occuring Character

For a given a string(str), find and return the highest occurring character.
Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.
Consider:
Assume all the characters in the given string to be in lowercase always.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
*/
package Assignments;
public class HighestOccuringCharacter {
    //coding ninjas solution
    public static char highestOccuringChar(String str) {
		//Your code goes here
        int n = str.length();
        if(n==0){  //for blank string
            return ' ';
        }
        //Initialize a frequency array to count how many times each character comes in the string
        int frequency[] = new int[256];
        //now initialize all elements to 0 so that we dont see unwanted behaviour
        for(int i=0;i<frequency.length;i++){
            frequency[i] = 0;
        }
        //now traverse for 1st time through the string array
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            frequency[ch]++; //this stores count of all charaters in the frequency array
        }
        //lets assume first char as ans
        char output = str.charAt(0);
        int max = frequency[output];
        //now traverse for 2nd time through the string array
        for(int i=1;i<n;i++){
            char ch = str.charAt(i);
            if(frequency[ch]>max){
                max = frequency[ch];
                output = ch;
            }
        }
        return output;
	}


  //main driver code to check for solution  
  public static void main(String[] args) {
      String str = "bbcabcaa"; //a is 3, b is 3, output must be a because a comes first
      System.out.println(highestOccuringChar(str));
  }  
}
