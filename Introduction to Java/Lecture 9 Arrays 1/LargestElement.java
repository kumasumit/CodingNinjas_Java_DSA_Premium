import java.util.Scanner;
public class LargestElement {
    public static int largestItem(int arr[]){
        int largestNumber = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestNumber){
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element at "+ i+ "th position");
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
        
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int largestNumber = largestItem(arr);
        System.out.println(largestNumber);
    }
}
