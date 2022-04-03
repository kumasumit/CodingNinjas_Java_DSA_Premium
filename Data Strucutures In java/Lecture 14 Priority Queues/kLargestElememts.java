import java.util.PriorityQueue;
public class kLargestElememts {

    public static void printKLargest(int arr[], int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(;i<arr.length;i++)
        {
            int min = pq.element(); //same as getMin
            if(min < arr[i])
            {
              pq.remove();
              pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
        System.out.print(pq.remove()+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,15,8,9,12,12,20};
        printKLargest(arr, 3); //12 15 20 
    }
    
}
