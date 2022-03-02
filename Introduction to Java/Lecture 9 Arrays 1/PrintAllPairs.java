import java.util.Scanner;
public class PrintAllPairs {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th position.");
            arr[i] = s.nextInt();
        }
        s.close();
        // 
        return arr;
    }
    public static void printAllPairs(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        printAllPairs(arr);
    }
}
