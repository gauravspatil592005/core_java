import java.util.ArrayList;

public class ExArrli {
    public static void main(String[] args) {
        // ArrayList<String> name = new ArrayList<>();
        // name.add("gaurav");
        
        // System.out.println(name.get(1));

        // name.remove(1);
        // name.remove("yogesh");
    
        // System.out.println("name");
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("mongo");
        list.add("sql");
        list.add("c");
        list.set(1, "python");
        list.add(2,"c++");
        System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains("html"));
        // System.out.println(list.isEmpty());

        Object[]arr = list.toArray();
        System.out.println(arr.toString());


    }
}
