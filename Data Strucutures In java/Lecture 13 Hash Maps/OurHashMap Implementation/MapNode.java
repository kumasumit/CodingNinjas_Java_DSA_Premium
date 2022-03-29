//first create a MapNode 
public class MapNode<K,V>{
    K key;
    V value;
    MapNode<K,V> next; //to store the pointer for the next node
    //constructor for mapnode
    public MapNode(K key, V value){
        this.key = key;
        this.value = value;
        //by default next of new node is null
    }

}