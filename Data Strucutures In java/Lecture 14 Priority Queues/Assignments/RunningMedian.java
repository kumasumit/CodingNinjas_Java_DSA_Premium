/*
Running Median
Send Feedback
You are given a stream of 'N' integers. For every 'i-th' integer added to the running list of integers, print the resulting median.
Print only the integer part of the median.
Input Format :
The first line of input contains an integer 'N', denoting the number of integers in the stream.

The second line of input contains 'N' integers separated by a single space.
Output Format :
Print the running median for every integer added to the running list in one line (space-separated).
Input Constraints
0 <= N <= 10 ^ 5
1 <= ARR[i] <= 10 ^ 5

Time Limit: 1 sec
Sample Input 1 :
6
6 2 1 3 7 5
Sample Output 1 :
6 4 2 2 3 4
Explanation of Sample Output 1 :
S = {6}, median = 6
S = {6, 2} -> {2, 6}, median = 4
S = {6, 2, 1} -> {1, 2, 6}, median = 2
S = {6, 2, 1, 3} -> {1, 2, 3, 6}, median = 2
S = {6, 2, 1, 3, 7} -> {1, 2, 3, 6, 7}, median = 3
S = {6, 2, 1, 3, 7, 5} -> {1, 2, 3, 5, 6, 7}, median = 4
Sample Input 2 :
5
5 4 3 2 1
Sample Output 2 :
5 4 4 3 3
*/
import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
public static void findMedian(int arr[])  {
		
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i : arr) {
			
			if(max.isEmpty()) {
				max.add(i);
			}
			else if( i  > max.peek() ) {
				min.add(i);
				if( (min.size() - max.size()) > 1 ) {
					int p = min.remove();
					max.add(p);
				}
			}
			else {
				max.add(i);
				if( (max.size() -min.size()) > 1  ) {
					int p = max.remove();
					min.add(p);
				}
			}
			
			if(max.size() > min.size()) {
				System.out.println(max.peek());
			}
			else if(max.size() < min.size()) {
				System.out.println(min.peek());
			}
			else {
				System.out.println( (max.peek() + min.peek()) /2  );
			}
			
			
		}
		
	}

	public static void main(String[] args) {
	 int arr[] = {5,4,3,2,1};
	 findMedian(arr);

	}

}
