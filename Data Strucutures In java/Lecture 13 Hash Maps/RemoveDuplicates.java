import java.util.ArrayList;
import java.util.HashMap;

/*
remove duplicates from the array and 
return the unique values in A ArrayList,
always nmaintain the order
*/
public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int arr[]) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for (Integer element : arr) {
            if (seen.containsKey(element)) {
                continue;
            }
            output.add(element);
            seen.put(element, true);
        }
        return output;
    }

    // Driver code to check our function
    public static void main(String[] args) {
      int arr[] = {1,3,1,4,5,100000, 200, 5,100000, 4};
      ArrayList<Integer> output = removeDuplicates(arr);
      for(int i=0;i<output.size();i++){
          System.out.print(output.get(i)+" ");
          //1 3 4 5 100000 200  is the output, the order of the array is maintained
      }

    }

}
