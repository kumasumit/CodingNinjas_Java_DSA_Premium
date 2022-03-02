import java.util.Scanner;
public class InputOfArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //gives the size the array.
        int arr[] = new int[n]; //creates a new integer array of size n
        for(int i=0;i<n;i++){
            System.out.println("Enter the value at "+i+ " th Position");
            arr[i] = s.nextInt();
        }
        //now we print the array
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " "); //this prints the input array.
        }
        s.close();
      
    }
}