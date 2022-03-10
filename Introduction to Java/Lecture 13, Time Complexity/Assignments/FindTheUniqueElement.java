/*
Find the Unique Element

You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the unique element present in the array.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
10
*/
import java.util.Arrays;
public class FindTheUniqueElement{
    //coding ninjas solution
    public static int findUnique(int[] arr){
        int XOR = 0;;
        for(int i=0;i<arr.length;i++)
        {
           XOR ^= arr[i];    
        }
        return XOR;  //time complexity is O(n) ans space Complexity is O(1).
    }
    //another approach
    public static int findUnique1(int[] arr) {
		//Your code goes here
        if(arr.length == 0){
            return -1;
        }
        Arrays.sort(arr); //nlogn
        if(arr[0]!=arr[1]){
            return arr[0]; //for 1st unique element
        }
        for(int i=1;i<arr.length-1;i++){  //bigo of n.
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                return arr[i];
            }
        }
        return -1; //final time complexity = nlogn+n
    }
    //main driver code
    public static void main(String[] args) {
        int arr1[] = {2,4, 7, 2, 7};
        System.out.println(findUnique(arr1));       
    }
}