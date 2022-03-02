import java.util.Scanner;

public class InputFunctionArrays {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // takes the size of input of the array.
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at "+i+" th Index");
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
    public static void printArray(int arr[]){
        int n = arr.length; //used to calculate the length of the array.
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        printArray(arr);
    }

}
