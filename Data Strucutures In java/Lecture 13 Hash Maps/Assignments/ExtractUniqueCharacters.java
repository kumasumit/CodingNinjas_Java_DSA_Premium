/*
Extract Unique characters
Send Feedback
Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.
Input format:
The first and only line of input contains a string, that denotes the value of S.
Output format :
The first and only line of output contains the updated string, as described in the task.
Constraints :
0 <= Length of S <= 10^8
Time Limit: 1 sec
Sample Input 1 :
ababacd
Sample Output 1 :
abcd
Sample Input 2 :
abcde
Sample Output 2 :
abcde
*/

package hashMapImplementation;
import java.util.HashMap;
public class ExtractUniqueCharacters {
	public static String uniqueChar(String str){
	if(str.length()==0) {
		return "";
	}
	String ans = "";
	HashMap<Character, Boolean> map = new HashMap<>();
	for(int currentIndex=0;currentIndex<str.length();currentIndex++) {
		char currentChar = str.charAt(currentIndex);
		if(!map.containsKey(currentChar)) {
			map.put(currentChar, true);
			ans += currentChar;
		}
	}
	return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ababacd";
		String str2 = "abcde";
		System.out.println(uniqueChar(str1));
		System.out.println(uniqueChar(str2));
		//abcd are the respective outputs
		//abcde

	}

}
