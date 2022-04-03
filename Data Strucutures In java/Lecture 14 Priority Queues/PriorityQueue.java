import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Integer> heap;

    public PriorityQueue() { // a constructor
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return heap.size() == 0; // .size is a function on ArrayList to check the size , here heap is implemented
                                 // as an Array
    }

    int size() {
        return heap.size();
    }

    int getMin() { // we are implementing minHeap by storing as Array , so minimum element will be
                   // at 0
        if (isEmpty()) {
            // throw Exception
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element); // puts element at the last of the Array.
        // now after insertion we do upheapify to check the heap property, the root has
        // to be less priority than both left child and right child
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            // now if the child is greater than the parent then we swap
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                // swap them
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                // reset the indexes
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    // delete function
    int removeMin() { // returns the deleted element
        if (isEmpty()) {
            // throw Exception
        }
        int temp = heap.get(0); // store first/min element in the heap
        heap.set(0, heap.get(heap.size() - 1)); // take an element from last and put it at first index of Heap.
        // remove the last element from the heap
        heap.remove(heap.size() - 1);
        // now lets start the heapify down process the process to check whether minHeap
        // properties are satisfied
        int index = 0;
        int minIndex = index;
        int leftChildIndex = // (2*i+1)
                1;
        int rightChildIndex = // (2*i+2)
                2;
        while (leftChildIndex < heap.size())
        {
            if (heap.get(leftChildIndex) < heap.get(minIndex)) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
                minIndex = rightChildIndex;
            }
            //if heap is already ok, then minIndex will not change
            if(minIndex==index){
                break;
            }else{
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                index = minIndex;
                leftChildIndex = (2*index+1);
                rightChildIndex = (2*index +2);

            }
        }

    return temp;
    }

    //driver code to check the functions
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        int arr[] = {5,1,9,2,0};
        for(int i=0;i<arr.length;i++)
        {
            pq.insert(arr[i]);

        }
        while(!pq.isEmpty()){
            System.out.print(pq.removeMin()+" ");
            //0 1 2 5 9 
            //the elements are in sorted order
            //overall time complexity of Heap Sort is nlogn 
            //overall space complexity of Heap sort is O(n), where n is size of array for which we create a Heap
        }

        System.out.println();

    }

}