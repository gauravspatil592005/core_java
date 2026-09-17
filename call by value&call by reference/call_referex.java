class student {
    String name;

}

public class call_referex {
    public static void changevalue(student s) {
        s.name = "gaurav";
        System.out.println("Value of name inside changevalue method: " + s.name);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "shiv";
        System.out.println("Value of name before calling changevalue method: " + s1.name);
        changevalue(s1);
        System.out.println("Value of name after calling changevalue method: " + s1.name);
    }
}