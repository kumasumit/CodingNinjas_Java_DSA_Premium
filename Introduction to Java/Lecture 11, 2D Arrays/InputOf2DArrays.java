//check how to get input in 2d Arrays
import java.util.Scanner;
public class InputOf2DArrays{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
