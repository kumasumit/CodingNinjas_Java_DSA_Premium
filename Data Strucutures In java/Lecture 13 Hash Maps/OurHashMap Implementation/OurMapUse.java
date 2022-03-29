//the third and final class which implements Hashmaps
public class OurMapUse {
    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        for(int i=0;i<20;i++)
        {
            map.insert("abc"+i+1+i);
            System.out.print("i = "+i+"lf = "+map.loadFactor());
        }
    }
    
}
