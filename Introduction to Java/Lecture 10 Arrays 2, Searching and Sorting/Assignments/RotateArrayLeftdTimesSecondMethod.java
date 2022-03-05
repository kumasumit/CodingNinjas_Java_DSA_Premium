import javax.sound.sampled.ReverbType;

//given an array rotate it left by d times.
//input {2, 6, 3, 1, 5}
//output after rotations by 2 times {3, 1, 5 ,1, 2, 6}

public class RotateArrayLeftdTimesSecondMethod {
    // coding ninjas solution code
    //public class Solution {
        // helper code to swap two elements in array
        private static void swapElements(int[] arr, int start, int end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        // helper code to reverse the array
        private static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                swapElements(arr, start, end);
                start++;
                end--;
            }
        }

        public static void rotate(int[] arr, int d) {
            // Your code goes here
            if(arr.length==0){
                return;
            }
            if(d>arr.length && arr.length!=0){
                d = d % arr.length; //to calculate effective d, if arr length is 5, d=6, effective d = 6%5=1
            }
            //first reverse Complete array
            reverse(arr, 0, arr.length-1);
            //after first reverse, reverse first n-d elements of the array
            reverse(arr, 0, arr.length-1-d);
            //after this reverse last d elements of the array
            reverse(arr, arr.length-d, arr.length-1);
          //after this step we get our output.            
        }
    //}

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 1, 5 };
        rotate(arr, 2);
        printArray(arr);
    }

}
