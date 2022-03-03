//given an unsorted array, sort it using insertion sort
//int arr[] = {9, 1, 4, 2 ,6};
//output: {1,2, 4,6,9}
public class InsertionSort{
    //coding ninjas solution code
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            //i will start from 1 and go till n-1 i<n, because we assume one element to be sorted in every round.
            //total no of rounds is n-1
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            
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
        insertionSort(arr);
        printArray(arr); //{5, 9, 10, 12, 61}.
    }
}