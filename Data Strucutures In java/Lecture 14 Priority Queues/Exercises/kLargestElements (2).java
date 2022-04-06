/*
Code : K largest elements
Send Feedback
You are given with an integer k and an array of integers that contain numbers in random order. Write a program to find k largest numbers from given array. You need to save them in an array and return it.
Time complexity should be O(nlogk) and space complexity should be not more than O(k).
Order of elements in the output is not important.
Input Format :
Line 1 : Size of array (n)
Line 2 : Array elements (separated by space)
Line 3 : Integer k
Output Format :
k largest elements
Sample Input :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
4
Sample Output :
12
16
20
25
*/




import java.util.ArrayList;
import java.util.PriorityQueue;
public class kLargestElements {
    //coding ninjas solution
    public static ArrayList<Integer> kLargest(int input[], int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //assume first k elements of array are largest, push them inside priorityQueue
        for(int i=0;i<k;i++)
        { 
            priorityQueue.add(input[i]);

        }
        //System.out.println("The queue is now as "+priorityQueue);
        //The queue is now as [3, 21, 45]
        for(int i=k;i<input.length;i++)
        { 
            if(priorityQueue.peek()<input[i])
            {
                //peek returns the min, head of the queue, if input[i] > min, remove the min and add input[i] to the end of the priorityQueue
              priorityQueue.remove();
              priorityQueue.add(input[i]);
              //System.out.println("The queue is now as "+priorityQueue);

            }

        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!priorityQueue.isEmpty()){
           ans.add(priorityQueue.remove());
        }
        return ans;
	}

    //driver code to check the solution

    public static void main(String[] args) {
      int arr[] = {21,3,45,67,89,90};
      ArrayList<Integer> output = kLargest(arr, 3);
      for(int i : output) {
          System.out.print(i+" "); //67 89 90
      }          
    }
    
}
