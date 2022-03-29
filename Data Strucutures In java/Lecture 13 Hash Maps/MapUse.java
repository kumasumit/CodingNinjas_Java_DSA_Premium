import java.util.HashMap;
import java.util.Set;
public class MapUse{

    //main driver code
    public static void main(String[] args) {
       HashMap<String, Integer> map = new HashMap<>();
       
       //insert
       map.put("abc", 1);
       map.put("def", 2);
       map.put("abc1", 10);
       map.put("def1", 20);
       map.put("abc", 5); //updates abc from 1 to 5, every key is unique, no dupplicate keys
       //check size
       System.out.println("size "+ map.size());

       //check Presence
       if(map.containsKey("abc")){
           System.out.println("has abc");
       }
       if(map.containsKey("abc1")){
           System.out.println("has abc1");
       }

       //get Value
       int v = 0;
       if(map.containsKey("abc1")){ //checks whether the key is actually present
           v = map.get("abc1"); //to protect from null pointer exception
       }
       System.out.println(v);

       //remove
       int s = map.remove("abc"); //removes the value and also returns the value
       System.out.println(s);
       
       //iterate
       Set<String> keys = map.keySet();
        //gives a set of all keys as a Set
       for(String str: keys){
           System.out.println(str);
       }
    }

}