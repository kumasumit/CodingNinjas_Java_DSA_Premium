//given an unsorted array, sort it using selection sort
//int arr[] = {9, 1, 4, 2 ,6};
//output: {1,2, 4,6,9}
public class SelectionSort{
    //coding ninjas solution code
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            //i will run till second lasr element because one element that is the last element is sorted by itself
            int min = Integer.MAX_VALUE;
            int minIndex = -1; //to store the minIndex
            for(int j=i;j<n;j++){
                //compare ith element with every other element in the array till the last element
                if(arr[j]<min){
                    min=arr[j];
                    minIndex = j;
                }
            }
            //swap element at minIndex with element at ith Position.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    //main code to check the solution code
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9, 1, 4, 2, 6};
        selectionSort(arr);
        printArray(arr);
    }
}