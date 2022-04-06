
public class checkMaxHeap {
	//program to check whether given array is a Max Heap or not,
	//it is a max heap only when all root nodes have priority greater than leftChild or RightChild
	public static boolean CheckMaxHeap(int[] arr)
	{
	for(int index=0;index<arr.length;index++)
	{
		int parentIndex = index;
		int leftChildIndex = 2*index+1;
		int rightChildIndex = 2*index+2;
		if(leftChildIndex < arr.length && arr[leftChildIndex] > arr[parentIndex]) {
			return false;
		}
		if(rightChildIndex < arr.length && arr[rightChildIndex] > arr[parentIndex]) {
            return false;			
		}
		
		
	}
	return true;
		
		
	}

	public static void main(String[] args) {
	  int arr[] = {42,20,18, 6,14,11,9,4};
		System.out.println(CheckMaxHeap(arr));

	}

	

}
