/*
 * Pairs with difference K
Send Feedback
You are given with an array of integers and an integer K. You have to find and print the count of all such pairs which have difference K.
Note: Take absolute difference between the elements of the array.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol n.
The following line contains n space separated integers, that denote the value of the elements of the array.
The following line contains an integer, that denotes the value of K.
Output format :
The first and only line of output contains count of all such pairs which have an absolute difference of K. 
Constraints :
0 <= n <= 10^4
Time Limit: 1 sec
Sample Input 1 :
4 
5 1 2 4
3
Sample Output 1 :
2
Sample Input 2 :
4
4 4 4 4 
0
Sample Output 2 :
6
*/


package hashMapImplementation;
import java.util.HashMap;
public class PairsWithDifferenceK {
	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		int pairCount = 0;
		for(int item:arr) 
		{
			int p1 = item + k;
			boolean flag = false;
			if(item == p1) 
			{
				flag = true; //this case is there for k=0
			}
			if(map.containsKey(p1)) 
			{
			  pairCount += map.get(p1);	
			}
			int p2 = item - k;
			if(map.containsKey(p2) && !flag)
			{
				pairCount += map.get(p2);
			}
			if(map.containsKey(item)) {
				map.put(item, map.get(item)+1);
			}else {
				map.put(item, 1);
			}
		}
		return pairCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,2,4};
		int arr1[] = {4,4,4,4};
		System.out.println(getPairsWithDifferenceK(arr, 3));  //2
		System.out.println(getPairsWithDifferenceK(arr1, 0)); //6

	}

}
