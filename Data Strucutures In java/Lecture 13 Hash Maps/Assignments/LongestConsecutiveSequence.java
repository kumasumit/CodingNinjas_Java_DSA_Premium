/*
Longest Consecutive Sequence
Send Feedback
You are given an array of unique integers that contain numbers in random order. You have to find the longest possible sequence of consecutive numbers using the numbers from given array.
You need to return the output array which contains starting and ending element. If the length of the longest possible sequence is one, then the output array must contain only single element.
Note:
1. Best solution takes O(n) time.
2. If two sequences are of equal length, then return the sequence starting with the number whose occurrence is earlier in the array.
Input format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol n.
The following line contains n space separated integers, that denote the value of the elements of the array.
Output format:
The first and only line of output contains starting and ending element of the longest consecutive sequence. If the length of longest consecutive sequence, then just print the starting element.
Constraints :
0 <= n <= 10^6
Time Limit: 1 sec
Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 12 
Sample Input 2 :
7
3 7 2 1 9 8 41
Sample Output 2 :
7 9
Explanation: Sequence should be of consecutive numbers. Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], but we should select [7, 8, 9] because the starting point of [7, 8, 9] comes first in input array and therefore, the output will be 7 9, as we have to print starting and ending element of the longest consecutive sequence.
Sample Input 3 :
7
15 24 23 12 19 11 16
Sample Output 3 :
15 16
*/

package hashMapImplementation;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class LongestConsecutiveSequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr)
	{
       Map<Integer, Boolean> visitedElements = new HashMap<>();
       Map<Integer, Integer> elementToIndexMapping = new HashMap<>();
       for(int i=0;i<arr.length;i++) {
    	   int num = arr[i];
    	   elementToIndexMapping.put(num, i);
    	   if(!visitedElements.containsKey(num)) {
    		   visitedElements.put(num, false);
    	   }
       }
       ArrayList<Integer> longestSequence = new ArrayList<>();
       int globalMaxSequenceLength = 1;
       int globalMinStartIndex = 0;
       for(int i=0;i<arr.length;i++) {
    	   int num = arr[i];
    	   int currentMinStartIndex = i;
    	   int count = 0;
    	   int tempNum = num;
    	   //forward
    	   while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
    		   visitedElements.put(tempNum, true); //mark visited elements in the arary as true
    		   count++;
    		   tempNum++;
    	   }
    	   //backward
    	   tempNum = num-1;
    	   while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
    		   visitedElements.put(tempNum, true); //mark visited elements in the arary as true
    		   count++;
    		   currentMinStartIndex = elementToIndexMapping.get(tempNum);
    		   tempNum++;
    	   }
    	   
    	   if(count > globalMaxSequenceLength) {
    		   globalMaxSequenceLength = count;
    		   globalMinStartIndex = currentMinStartIndex;
    	   }else if(count == globalMaxSequenceLength) {
    		   if(currentMinStartIndex < globalMinStartIndex) {
    			   globalMinStartIndex = currentMinStartIndex;
    		   }
    	   }
       }
       int globalStartNum = arr[globalMinStartIndex];
       longestSequence.add(globalStartNum);
       if(globalMaxSequenceLength>1) {
    	   longestSequence.add(globalStartNum + globalMaxSequenceLength-1);
       }
       return longestSequence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 7, 2, 1, 9, 8, 41};
		System.out.println(longestConsecutiveIncreasingSequence(arr));
		/*
		 * [7 ,9]
Explanation: Sequence should be of consecutive numbers. Here we have 2 sequences with same length
 i.e. [1, 2, 3] and [7, 8, 9], but we should select [7, 8, 9] because the starting point of [7, 8, 9] comes first
  in input array and therefore, the output will be 7 9, as we have to print starting 
  and ending element of the longest consecutive sequence.

		 */

	}

}
