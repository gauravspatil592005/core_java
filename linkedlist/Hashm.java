import java.util.HashMap;

public class Hashm {
public static void main(String[] args) {
    HashMap<Integer,String>map=new HashMap<>();
    map.put(102, "gaurav");
     map.put(103, "raj");
      map.put(104, "omkar");
       map.put(105, "shiv");
       System.out.println(map.get(102));
       map.remove(102);
       System.out.println(map.get(102));
       for(Integer key:map.keySet()){
  System.out.println(Key+":"+map.get(key));
       }
     
}
}