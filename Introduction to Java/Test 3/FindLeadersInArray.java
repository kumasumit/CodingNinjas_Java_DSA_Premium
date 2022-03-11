/*
Find Leaders in array
Send Feedback
Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
Print all the leader elements separated by space and in the reverse order. That means whichever leader comes at last should be printed first.
Input Format :
Line 1 : Integer n, size of array
Line 2 : Array A elements (separated by space)
Output Format :
 leaders of array (separated by space)
Constraints :
1 <= n <= 10^6
Sample Input 1 :
6
3 12 34 2 0 -1
Sample Output 1 :
-1 0 2 34
Sample Input 2 :
5
13 17 5 4 6
Sample Output 2 :
6 17
*/
public class FindLeadersInArray{
    //coding ninjas solution
    public static void leaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                System.out.print(arr[i]+ " ");
                max = arr[i];
            }
        }		
	}
    //main driver code
    public static void main(String[] args) {
     int arr[] = {13, 17, 5, 4, 6};
     leaders(arr); //output 6 17    
    }
}