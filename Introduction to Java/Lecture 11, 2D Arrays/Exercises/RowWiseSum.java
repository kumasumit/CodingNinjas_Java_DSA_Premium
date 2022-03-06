/*
Row Wise Sum

For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output Format :
For each test case, print the sum of every ith row elements in a single line separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 2 
1 2 
3 4 
5 6 
7 8
Sample Output 1:
3 7 11 15 
Sample Input 2:
2
2 5 
4 5 3 2 6 
7 5 3 8 9
4 4
1 2 3 4
9 8 7 6
3 4 5 6
-1 1 -10 5
Sample Output 2:
20 32 
10 30 18 -5 
*/

package Exercises;
public class RowWiseSum {
    //coding ninjas solution
    public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        int rows = mat.length;
        if(rows == 0){
            return; //this we are doing for blank array. 
        }
        int cols = mat[0].length;
        for(int i=0;i<rows;i++){
            int rowSum = 0;
            for(int j=0;j<cols;j++){
               rowSum = rowSum + mat[i][j];
            }
            System.out.print(rowSum + " ");
        }
	}
    //main to check driver code
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3 ,4}, {5, 6, 7, 8},  {2 , 2, 1 , 1}};
        rowWiseSum(mat); //expectedOutput 10 26 6 in same line separated by space
    }    
}
