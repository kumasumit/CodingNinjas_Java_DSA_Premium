/*
Kth largest element
Send Feedback
Given an array A of random integers and an integer k, find and return the kth largest element in the array.
Note: Try to do this question in less than O(N * logN) time.
Input Format :
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
The following contains an integer, that denotes the value of k.
Output Format :
The first and only line of output contains the kth largest element
Constraints :
1 <= N, Ai, k <= 10^5
Time Limit: 1 sec
Sample Input 1 :
6
9 4 8 7 11 3
2
Sample Output 1 :
9
Sample Input 2 :
8
2 6 10 11 13 4 1 20
4
Sample Output 2 :
10
*/
import java.util.PriorityQueue;
public class kthLargestElement {
	public static int kthLargest(int n, int[] input, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			priorityQueue.add(input[i]); //place the first k elements in priority Queue
			 
		}
		System.out.println(priorityQueue); //[2, 6, 10, 11]
		for(int i= k ;i < input.length;i++) { //go from k to the last of the array.

			if(input[i] > priorityQueue.peek() ) { //if element is greater than the smallest stored in priority Queue remove it
				priorityQueue.remove();
				System.out.println(priorityQueue);
				priorityQueue.add(input[i]);//add the greater element to the priority Queue
			}
			System.out.println(priorityQueue);
		}
		 //after entire process is completed, inside queue you have k largest elements, remove from the queue to get kth largest element
		return priorityQueue.remove();
		

	}

	public static void main(String[] args) 
	{
		int arr[] = {9,4,8,7,11,13};
		int arr1[] = {2,6,10,11,13,4,1,20};
		System.out.println(kthLargest(8, arr1, 4)); //10
		System.out.println(kthLargest(6, arr, 3));	//9

	}

}
