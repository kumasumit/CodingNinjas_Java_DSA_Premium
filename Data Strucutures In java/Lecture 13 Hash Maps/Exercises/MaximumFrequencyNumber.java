/*
  Maximum Frequency Number
Send Feedback
You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
If two or more elements contend for the maximum frequency, return the element which occurs in the array first.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains most frequent element in the given array.
Constraints:
0 <= N <= 10^8
Time Limit: 1 sec
Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 
Sample Output 1 :
2
Sample Input 2 :
3
1 4 5
Sample Output 2 :
1 
*/



package hashMapImplementation;
import java.util.HashMap;
public class MaximumFrequencyNumber {
	public static int maxFrequency(int[] arr)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int item:arr) {
			//we are going through each item of the array and put its frequency as value .and item in array as key
			if(hashMap.containsKey(item)) {
				hashMap.put(item, hashMap.get(item)+1);
			}else {
				hashMap.put(item, 1);
			}
			//hashMap.put(item, hashMap.getOrDefault(item, 0)+1)
		}
		int max = 0, ans = Integer.MIN_VALUE;
		for(int item:arr) 
		{
			if(hashMap.get(item) > max)
			{
			  max = hashMap.get(item);
			  ans = item;
			}
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {2,6,2,2,2,45,23,47,89};
		System.out.println(maxFrequency(arr)); //2 answer
		

	}

}
