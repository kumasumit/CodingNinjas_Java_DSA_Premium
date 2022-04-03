
/*
Code : Max Priority Queue
Send Feedback
Implement the class for Max Priority Queue which includes following functions -
1. getSize -
Return the size of priority queue i.e. number of elements present in the priority queue.
2. isEmpty -
Check if priority queue is empty or not. Return true or false accordingly.
3. insert -
Given an element, insert that element in the priority queue at the correct position.
4. getMax -
Return the maximum element present in the priority queue without deleting. Return -Infinity if priority queue is empty.
5. removeMax -
Delete and return the maximum element present in the priority queue. Return -Infinity if priority queue is empty.
Note : main function is given for your reference which we are using internally to test the class.
*/
import java.util.ArrayList;

public class MaxPriorityQueue {
    private ArrayList<Integer> heap;

    // constructor
    public MaxPriorityQueue() {
        heap = new ArrayList<>();
    }

    // Implement the isEmpty() function here
    boolean isEmpty() {

        return heap.isEmpty(); // here isEmpty is inbuilt function of java to check wnhther an arraylist is
                               // empty pr not
    }

    // Implement the getSize() function here
    int getSize() {
        return heap.size(); // inbuilt funcction of arraylist to check size of arraylist
    }

    // Implement the getMax() function here
    int getMax() {

        if (heap.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return heap.get(0); // returns the head of the queue
        }
    }

    // Implement the insert() function here
    void insert(int element) {
        heap.add(element);
        upHeapify();

    }

    // Implement UpHeapify here
    private void upHeapify() {
        int childIndex = heap.size() - 1; // last element of the heap, element is always added to the last of the array
        while (childIndex > 0) {
            int parentIndex = (childIndex - 1) / 2;
            // Check if parent has lesser priority than the child. If it does, swap them
            if (heap.get(childIndex) > (heap.get(parentIndex))) {
                // then we swap because the parent has to have the highest priority in Max heap
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex)); // here we are using set method of Arraylist given by Java
                heap.set(parentIndex, temp);
                childIndex = parentIndex; // now we move up the chain by making childIndex = parentIndex
            } else {
                break; // we come out of while loop
            }
        }

    }

    // Implement the removeMax() function here
    int removeMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        // Remove the Max element and store it
        int maxElement = heap.get(0); // maxElement is the head in a Max Queue
        // Set the last element to the root/head of the queue
        heap.set(0, heap.get(heap.size() - 1)); // set is inbuilt method of ArrayList
        // remove the last element from the queue/arraylist
        heap.remove(heap.size() - 1); // here remove is the remove method of the arraylist as defined by Java
        // Start reinstating max. heap property from root to leaf
        downHeapify();
        return maxElement; // return the head/maxElement in case of Priority Queue
    }

    private void downHeapify() {
        // Start reinstating max. heap property from root to leaf
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        int maxIndex = 0;
        // the array ends when the left child is last or 2nd last, so we run the loop
        // till it is less than size, if it is last leftChild<heap.size()
        while (leftChildIndex < heap.size()) {
            // if left child is greater than parent , make maxIndex = leftChild
            if (heap.get(leftChildIndex) > heap.get(maxIndex)) {
                maxIndex = leftChildIndex;
            }
            // if right child is greater than parent , make maxIndex = rightChild
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
                maxIndex = rightChildIndex; // here we check rightChildIndex < heap.size(), so that it is not out of
                                            // bounds of the array
            }
            // now if the maxIndex is changed
            if (maxIndex != parentIndex) {
                // here we swap and pass maximum value to the parent
                int temp = heap.get(maxIndex);
                heap.set(maxIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                parentIndex = maxIndex; // now we go further down to check if heap max property is true for all nodes
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            } else { // if maxIndex is not changed, parent is the maximum element then come out of
                     // the loop
                break;
            }
        } // while loop closes
    }// downHeapify closes

}
