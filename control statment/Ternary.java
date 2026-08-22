public class Ternary {
    public static void main(String[] args) {
        int marks=45;
        String result=(marks >90)? "A+" : 
(marks >60)? "B+" :
        (marks >40)? "c+" :
         (marks >35)? "fail" : "fail";

        System.out.println(result);
    }
}
            