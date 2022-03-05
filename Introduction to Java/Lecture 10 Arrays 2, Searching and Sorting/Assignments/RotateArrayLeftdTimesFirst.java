//given an array rotate it left by d times.
//input {2, 6, 3, 1, 5}
//output after rotations by 2 times {3, 1, 5 ,1, 2, 6}

public class RotateArrayLeftdTimesFirst {
    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int j=1;
        while(j<=d){
            int temp = arr[0];
            int i;
            for(i=0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
           arr[i-1]=arr[i];
           arr[i]= temp;
           j++;
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
