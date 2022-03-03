//given an unsorted array, sort it using bubble sort
//int arr[] = {9, 1, 4, 2 ,6};
//output: {1,2, 4,6,9}
public class BubbleSort{
    //coding ninjas solution code
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            //i will run till second last element because one element that is the last element is sorted by itself
            //total no of rounds is n-1
            for(int j=0;j<n-1-i;j++){
                //compare jth element with every j+1 element
                //always start from 0 and in every round one element at the last is sorted.
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            
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
        int arr[] = {9, 10, 5, 12, 61};
        bubbleSort(arr);
        printArray(arr);
    }
}