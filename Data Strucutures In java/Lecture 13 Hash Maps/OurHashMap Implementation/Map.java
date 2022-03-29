import java.util.ArrayList;

/*
Implement your ouwn Hashmap using Separate Chaining, 
using each entry as a linked list node.
in separate chaining, each index has multiple entries as linked list node all stored at the same address.
*/

public class Map {
    ArrayList<MapNode<K,V>> buckets;
    int size;
    int numBuckets;
    public Map()
    {
        numBuckets = 20;
        buckets = new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            buckets.add(null);
        }
    }
    //Create a new private HashFuction
    private int getBucketIndex(K key)
    {
        int hasCode = key.hasCode(); //inbuilt hasCode function for Object Class
        return hasCode % numBuckets; //compressor function
    }

    //Create our insert/put function
    public void insert(K key, V value){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head!=null)
        {
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        //if we reach here means the key is not present 
        //and we need to create a newNode
        //now head is pushed to the last
        //we need to bring head to the start of the linked list- 
        head = buckets.get(bucketIndex);
        //create a new node at bucketIndex
        MapNode<K,V> newElementNode = new MapNode<K,V>(key, value);
        size++; //update the size
        newElementNode.next = head;
        buckets.set(bucketIndex, newElementNode);
        //optimization with load Factor
        double loadFactor = (1.0 * size)/numBuckets;
        if(loadFactor > 0.7){
            rehash();
        }
    }
    //Implement Rehash function
    private void rehash()
    {
        System.out.print("Rehashing buckets "+numBuckets+"size: "+size);
        ArrayList<MapNode<K,V>> temp = buckets;
        buckets = new ArrayList<>();
        //initialize all the items in the new buckets to null
        for(int i=0;i<2*numBuckets;i++)
        {
            buckets.add(null);
        }
        size = 0;
        numBuckets *= 2;
        for(int i=0;i<temp.size();i++){
            MapNode<K,V> head = temp.get(i);
            while(head!=null)
            {
                K key = head.key;
                V value = head.value;
                insert(key, value); //this will insert in the buckets ArrayList
                head = head.next;
            }
        }
    }
    //loadfactor
    public double loadFactor(){
        return (1.0 * size) / numBuckets;
    }
    //Implement getvalue/get function
    public V getValue(K Key)
    {
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head != null)
        {
           if(head.key.equals(key))
           {
               return head.value;
           }
           head = head.next;
        }
        return null;
    }

    //implement remove function
    public V removeKey(K key)
    {
       int bucketIndex = getBucketIndex(key);
       MapNode<K,V> head = buckets.get(bucketIndex);
       MapNode<K,V> prev = null;
       while(head != null)
       {
         if(head.key.equals(key))
         {   //if the key is found
             size--;
             if(prev == null)
             {
                 bucket.set(bucketIndex, head.next);
             }else
             {
                 prev.next = head.next;
             }
             return head.value; //removes the head value
         }
         prev = head;
         head = head.next;
       }
       //if nothing is found , after while loop
       return null;
    }

    //size function
    public int size()
    {
        return size;
    }

}
