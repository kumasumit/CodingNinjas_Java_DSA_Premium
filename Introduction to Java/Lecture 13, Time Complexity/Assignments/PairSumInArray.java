
/*
Pair sum in array

You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
Note:
Given array/list can contain duplicate elements. 
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'num'.
Output format :
For each test case, print the total number of pairs present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4
0 <= num <= 10^9

Time Limit: 1 sec
Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0
2


 Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.

For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
*/
import java.util.Arrays;
public class PairSumInArray {
    // coding ninjas solution O(nlogn)
    public static int pairSum(int[] arr, int num) {
        // Your code goes here
        Arrays.sort(arr); // nlogn
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int numPair = 0;
        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] < num) {
                // move from left to right, increase start
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                // move from right to left, decrease end
                endIndex--;
            } 
            else 
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

    // brute force with O(n^2)
    public static int pairSum1(int[] arr, int num) {
        // Your code goes here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    count++;
                }
            }
        }
        return count;
    }

    // main driver code
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 6,4 };
        System.out.println(pairSum1(arr, 6));
    }
}
