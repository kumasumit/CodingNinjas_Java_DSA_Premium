//Write a function to get input and output of 2D Arrays.
import java.util.Scanner;
public class InputOutputFunctionArrays{
    static Scanner s = new Scanner(System.in);
    public static int[][] takeInput(){
        System.out.println("Enter the number of rows");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns");
        int cols = s.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element at "+ i+"th row and "+j+"th column");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    } 
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    int arr[][] = takeInput();
    printArray(arr);
    s.close();
}

}