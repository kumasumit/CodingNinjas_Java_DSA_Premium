/*
Duplicate in array

You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6

Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3
*/
import java.util.Arrays;
public class DuplicateInArray {
    //coding ninjas solution
    public static int findDuplicate(int[] arr) {
		//Your code goes here
        //first we calculate the arraySum, Sum Of elements of the Array
        int arraySum = 0;
        for(int i=0;i<arr.length;i++){
           arraySum += arr[i];
        }
        //we are given for n sized array elements range from 0 to n-2
        //so lets calculte sum of first n-2 natural numbers.
        int n = arr.length;
        int naturalNumberSum = ((n-2) * (n-1))/2;
        //its obvious the duplicate is added twice, so 
        int result = arraySum - naturalNumberSum; //gives us the duplicate number
        return result;  //time complexity O(n), spaceComplexity O(1)
	}

    //another approach time complexity O(n^2)
    public static int findDuplicate1(int[] arr) {
		//Your code goes here
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1; //time complexity is O(n^2).
	}
    //another approach time complexity O(nlogn)
    public static int findDuplicate2(int[] arr) {
		//Your code goes here
        Arrays.sort(arr); //nlogn
        for(int i=0;i<arr.length-1;i++){ //n
            
                if(arr[i]==arr[i+1]){
                    return arr[i];
                }
            }
        
        return -1; //time complexity is O(nlogn).
	}


    //main driver code
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,0};
        System.out.println(findDuplicate2(arr)); //returns the duplicate element
    }
}
