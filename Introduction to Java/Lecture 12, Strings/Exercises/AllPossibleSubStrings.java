/*
Print All Substrings

For a given input string(str), write a function to print all the possible substrings.
Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
Print the total number of substrings possible, where every substring is printed on a single line and hence the total number of output lines will be equal to the total number of substrings.
Note:
The order in which the substrings are printed, does not matter.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abc
Sample Output 1:
a 
ab 
abc 
b 
bc 
c 
 Sample Input 2:
co
Sample Output 2:
c 
co 
o
*/

package Exercises;
public class AllPossibleSubStrings {
    //Coding Ninjas Solution Code
    public static void printSubstrings(String str) {
		//Your code goes here
        int n = str.length(); //calculates length of string and stores it in n
        //here we are printing substrings length wise 
        //i.e, first 1, 2, 3, 4 from 1 to n
        for(int len=1;len<=n;len++){
            for(int start =0;start<=n-len;start++){
                //for each length we are changing the start and end 
                //and printing all possible value for a given start and end
                int end = start+len;
                System.out.println(str.substring(start, end));
            }
        }    
	} 

  //Main Driver Code to check solution  
  public static void main(String[] args) {
      String str = new String("pqrs");
      printSubstrings(str);    
  }  
}
