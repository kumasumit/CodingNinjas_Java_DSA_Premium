/*
Triplet sum

You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.
Output format :
For each test case, print the total number of triplets present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9

Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
*/
import java.util.Arrays;
public class TripletSumInArray {
    //coding ninjas solution
    private static int pairSum(int arr[], int startIndex, int endIndex, int num){
        int numPair = 0;
        while(startIndex < endIndex){
            if (arr[startIndex] + arr[endIndex] < num) {
                // move from left to right, increase start
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                // move from right to left, decrease end
                endIndex--;
            } else 
            {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];
                // to check for {2,2,2,2,2} all elements same condition
                if (elementAtStart == elementAtEnd) {
                    int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += ((totalElementFromStartToEnd) * (totalElementFromStartToEnd - 1)) / 2;
                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;
                // to check for index of same elements from start/left
                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
                    tempStartIndex++;
                }
                // to check for index of same elements from end/right
                while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex--;
                }
                // count no of same elements from start
                int totalElementFromStart = tempStartIndex - startIndex;
                // count no of same elements from end
                int totalElementFromEnd = endIndex - tempEndIndex;
                // count no. of total num pairs n*m
                numPair += (totalElementFromEnd * totalElementFromStart);
                // adjust start and end
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;

            }
        }
        return numPair;
    }
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr); //nlogn
        int n = arr.length;
        int numTriplets = 0;
        for(int i=0;i<arr.length;i++){
            int pairSumFor = num - arr[i];
            int numPairs = pairSum(arr, (i+1), (n-1), pairSumFor);
            numTriplets += numPairs;
        }
        return numTriplets;

	}
    //main driver code to check solution    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,0};
        System.out.println(tripletSum(arr, 7));
    }
}
