//here we use inbuilt Priority Queue in java
import java.util.PriorityQueue;

public class PriorityQueueUse {
  public static void main(String[] args) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      int arr[] = {9,1,0,4,7,3};
      for(int i=0;i<arr.length;i++){
          pq.add(arr[i]); //here add is same as insert
      }
      while(!pq.isEmpty()){
          System.out.print(pq.remove()+" ");
      }
  }    
}
