//given an array rotate it left by d times.
//input {2, 6, 3, 1, 5}
//output after rotations by 2 times {3, 1, 5 ,1, 2, 6}

public class RotateArrayLeftdTimesOptimized {
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length;
        int temp[] = new int[d];
        for(int j=0;j<d;j++){
            temp[j] = arr[j];
        }
        int i;
        for(i=0;i<n-d;i++){
            arr[i] = arr[i+d];
        }
        for(int j=0;j<d;j++){
            arr[i] = temp[j];
            i++;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 1 , 5};
        rotate(arr, 2);
        printArray(arr);
    }
    
}
