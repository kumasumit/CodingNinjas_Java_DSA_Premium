/*
Spiral Print

For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.
Refer to the Image:
Alt txt

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30 
*/



public class SpiralPrint {
    //coding ninjas solution
    public static void spiralPrint(int mat[][]){
        int rows = mat.length; //gives the total length of rows
        if(rows == 0){
            return;
        }
        int cols = mat[0].length;
        int i, rowStart=0, colStart=0;
        int numberOfElements = rows*cols, count = 0;
        while(count<numberOfElements){
            //Section 1
            for(i=colStart;count<numberOfElements && i<cols;i++){
                System.out.print(mat[rowStart][i]+ " ");
                count++; //always increase count when you print one element.
            }
            rowStart++;

            //Section 2
            for(i=rowStart;count<numberOfElements && i<rows;i++){
                System.out.print(mat[i][cols-1]+ " ");
                count++;
            }
            cols--;

            //Section 3
            for(i=cols-1;count<numberOfElements && i>=colStart;i--){
                System.out.print(mat[rows-1][i]+ " ");
                count++;
            }
            rows--;

            //Section 4
            for(i=rows-1;count<numberOfElements && i>=rowStart;i--){
                System.out.print(mat[i][colStart]+ " ");
                count++;
            }
            colStart++;
        }
    }

    //main driver code to check for the solution
    public static void main(String[] args) {
        int mat[][]={{1,2,3,4}, {5,6,7,8}, {9,10,11, 12},{13, 14, 15, 16}};
        spiralPrint(mat);
    }

    
}
