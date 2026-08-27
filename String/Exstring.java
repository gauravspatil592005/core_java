public class Exstring{
    public static void main(String[] args) {
      String a="gaurav";
      String b="gaurav";
      System.out.println(a==b);
      //true

      String name1=new String("gaurav");
      String name2=new String("gaurav");
      
         System.out.println(name1==name2);
         // false

         System.out.println(name1.equals(name2));
         //true 
    }
}