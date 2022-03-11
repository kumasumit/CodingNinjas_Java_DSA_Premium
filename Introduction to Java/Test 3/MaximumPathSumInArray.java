/*
Maximise the sum
Send Feedback
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.
Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces
Output Format :
Maximum sum value
Constraints :
1 <= M, N <= 10^6
Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
*/

public class MaximumPathSumInArray {
    //coding ninjas solution
	public static long maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        long maxSum = 0;
        if(input1.length ==0 && input2.length==0){
            return maxSum; //in case both ararys are empty
        }
        long sum1 = 0;
        long sum2 = 0;
        int i=0, j=0;
        while(i<input1.length && j<input2.length){
          if(input1[i]<input2[j]){
              sum1 += input1[i];
              i++;
          }else if(input2[j]<input1[i]){
              sum2 += input2[j];
              j++;
          }else if(input1[i]==input2[j]){ //intersection point             
            sum1 += input1[i];
            sum2 += input2[j];
            maxSum += Math.max(sum1, sum2);
            sum1=0; //reinitialize both sums and start again
            sum2=0;
            i++;
            j++;
          } 
        }
        //System.out.println(i);
        //System.out.println(input1.length);
        while(i<input1.length){ //in case there are still elements in 1st array
            //System.out.println(i);
            sum1 += input1[i];
            i++;
            //System.out.println(sum1);
            //System.out.println(i);
        }
        //System.out.println(sum1);
        while(j<input2.length){//in case there are still elements in 1st array
            sum2 += input2[j];
            j++;
        }
		maxSum += Math.max(sum1, sum2);
        return maxSum;
	}


//driver code to check the solution    
public static void main(String[] args) {
    int arr1[] = {1, 5, 10, 15 , 20, 25};
    int arr2[] = {2, 4, 5 , 9 , 15};
    System.out.println(maximumSumPath(arr1, arr2)); //output 81
}
}
