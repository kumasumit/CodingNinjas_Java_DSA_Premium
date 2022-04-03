
public class InPlaceHeapSort {
    //insert without creating new Array, in place insertion,
    private static void insertIntoVirtualHeap(int[] arr, int i) 
    {
       int childIndex = i;
       int parentIndex = (childIndex-1)/2;
       while(childIndex>0){
           if(arr[childIndex]<arr[parentIndex])
           {
              //swap both 
              int temp = arr[childIndex];
              arr[childIndex] = arr[parentIndex];
              arr[parentIndex] = temp;
              childIndex = parentIndex;
              parentIndex = (childIndex-1)/2;
           }else
           {
               return;
           }
       }
    }
    
    //delete from virtal heap 
    private static int removeMinFromVirtualHeap(int[] arr, int heapSize)
    {
      int temp = arr[0];
      arr[0]=arr[heapSize-1];
      heapSize--;
      int index=0;
      int leftChildIndex = (2*index)+1;
      int rightChildIndex = (2*index)+2;
      while(leftChildIndex<heapSize){
          int minIndex = index;
          if(arr[leftChildIndex]<arr[minIndex]){
              minIndex = leftChildIndex;
          }
          if(rightChildIndex < heapSize && arr[rightChildIndex]<arr[minIndex]){
              minIndex = rightChildIndex;
          }
          if(minIndex!=index){
             int temp1 = arr[index];
             arr[index] = arr[minIndex];
             arr[minIndex] = temp1;
             index = minIndex;
             leftChildIndex = 2*index+1;
             rightChildIndex = 2*index+2;
          }else{
              break;
          }
        
      }
     return temp;
    }

    //driver code to check the functions
    public static void main(String[] args) {
        int arr[] = {2,6,8,5,4,3};
        for(int i=0;i<arr.length;i++)
        {
           insertIntoVirtualHeap(arr, i);

        }
        //now after this step the array will be stored as heap in a tree form
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            //0 1 6 5 2 9 is the tree representation 
        }
        System.out.println();
        //now after this we remove from heap and rearrange the items in sorted order in the array
        for(int i=0;i<arr.length;i++){
            arr[arr.length-1-i]=removeMinFromVirtualHeap(arr, arr.length-i); 
            //here arr.length-i is the heap size which will go on decreasing
            //arr is the array which is constant
        }
        //now we have arr in sorted order from left to right, that is descending order
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            //9 6 5 2 1 0 to get in ascending order , we can have Maxheap in place of minHeap 
        
        }
        
    }   
}