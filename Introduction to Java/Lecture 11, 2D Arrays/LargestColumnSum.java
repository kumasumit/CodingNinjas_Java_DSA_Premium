//Given a 2d array calculate the largest sum of any column and return that sum.
//input 2d array   123
                // 456 colsum are 5, 7, 9 output must be 9

public class LargestColumnSum {
    public static int largestColSum(int arr[][]){
        int rows = arr.length; //gives no of rows
        int cols = arr[0].length; //gives no of columns , which will be same for each row here
        int largest = Integer.MIN_VALUE; //in case for blank array
        
        for(int j=0;j<cols;j++){
            int sum = 0;
            for(int i=0;i<rows;i++){
                sum = sum + arr[i][j];
            }
            //we have sum for jth column for every row here
            if(sum>largest){
                largest = sum;
            }

        }
        //now we come out of cols for loop , we have largest sum for entire aarary
        return largest;
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5,6}};
        int largestColSum = largestColSum(arr);
        System.out.println(largestColSum); //outputs 9 
    }
}
