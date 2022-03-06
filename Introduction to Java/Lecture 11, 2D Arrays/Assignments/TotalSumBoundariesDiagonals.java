/*
Total Sum on the Boundaries and Diagonals

For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
Input format:
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the two-dimensional square matrix.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'N' column values separated by a single space.
Output format:
For each test case, print the single integer denoting the sum.

Output for every test case will be printed in a seperate line.
Constraints:
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16
Sample Output 2:
273
136
*/
public class TotalSumBoundariesDiagonals{
    //coding ninjas solution code
    public static int getFirstDiagonalSum(int arr[][], int dimension){
        //here we start from 1st row 1st element
        int currRow = 0;
        int currCol = 0;
        int diagonalSum = 0;
        while(currRow < dimension && currCol < dimension){
            diagonalSum += arr[currRow][currCol];
            currCol++;
            currRow++;
        }
        return diagonalSum;
    }
    public static int getSecondDiagonalSum(int arr[][], int dimension){
      //here we start from 1st row last element
      int currRow = 0;
      int currCol = dimension - 1;
      int diagonalSum = 0;
      while(currRow<dimension && currCol >=0){
          diagonalSum += arr[currRow][currCol];
          currRow++;
          currCol--;
      }
      return diagonalSum;
    } 
    public static int getBoundarySum(int arr[][], int dimension){
        int sum = 0;
        for(int i=1;i<dimension-1;i++){
            //upper side 
            sum = sum + arr[0][i]; //row fixed increase col from 1 to 2nd last
            //lower side 
            sum = sum + arr[dimension-1][i]; //row fixed last row, col from 1 to 2nd last.
            //left side
            sum = sum + arr[i][0]; //col fixed , go from 2nd row to 2nd last row.
            //right side
            sum = sum + arr[i][dimension-1]; //col fixed, last column go from 2ndrow to 2nd last Row.
        }
        return sum;
    }
    public static void totalSum(int[][] arr) {
		//Your code goes here
        int n = arr.length;
        int sum = 0;
        if(n==0){
            System.out.println(sum);
            return;
        }
        int totalSum = getFirstDiagonalSum(arr, n) + getSecondDiagonalSum(arr, n)+ getBoundarySum(arr, n);
        if(n%2!=0){
            totalSum = totalSum - arr[n/2][n/2]; //because for odd numbers it is added twice
        }
        System.out.println(totalSum);
	}

    //main driver code to check solution
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        totalSum(arr); //45
    }
}