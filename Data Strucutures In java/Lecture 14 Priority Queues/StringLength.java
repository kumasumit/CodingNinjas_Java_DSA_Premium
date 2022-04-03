import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String>
{
    public int compare(String o1, String o2)
    {
      if(o1.length()<o2.length()){
          return -1; //means here we swap it
      }else if(o1.length()>o2.length()){
          return 1;
      }else{
          return 0;
      }

    }
    
} 
class StringLengthComparator1 implements Comparator<String>
{
    public int compare(String o1, String o2)
    {
      if(o1.length()<o2.length()){
          return 1; 
      }else if(o1.length()>o2.length()){
          return -1;//means here we swap it
      }else{
          return 0;
      }

    }
    
} 


public class StringLength
{   public static void main(String[] args)
     {
        String arr[] = {"this", "at", "a", "their", "queues"};
        StringLengthComparator stringComparator = new StringLengthComparator();
        StringLengthComparator1 stringComparator1 = new StringLengthComparator1();
        PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
        PriorityQueue<String> pq1 = new PriorityQueue<>(stringComparator1);
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }    
         System.out.println();
        //arrange the strings in descending order
        for(int i=0;i<arr.length;i++){
            pq1.add(arr[i]);
        }
        while(!pq1.isEmpty()){
            System.out.print(pq1.remove()+" ");
        }    
     }
    
}
