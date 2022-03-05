//Given a sorted arary1 of size m.
//Given a sorted array2 of size n.
//Create a new sorted Array of size(m+n) by combining two ararys.

public class MergeSort{

    public static int[] mergeSort(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int arr3[] = new int[m+n];
        int i=0, j=0, k=0; //Initialize all pointers for arr1, arr2, arr3 to i, j and k and initialize them to zero.
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }//when either arr1 or arr2 exceeds its length
        while(i<m){ //Put all remaining elements of arr1 into arr3
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){ //Put all remaining elements of arr2 into arr3
            arr3[k] = arr2[j];
            j++;
            k++;
        }
     return arr3;
    } 





    //main code to check the solution
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {12, 34,56 ,78}; //A sorted array1 of size m.
        int arr2[] = {2, 5, 100, 200}; //A sorted array2 of size n.
        int arr3[] = mergeSort(arr1, arr2);
        printArray(arr3); //outputts {2, 5 ,12, 34, 56 ,78, 100, 200}

    }
}
