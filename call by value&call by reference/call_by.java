public class call_by {
    public static void changevalue(int a) {
        a = 10;
        System.out.println("Value of a inside changevalue method: " + a);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Value of x before calling changevalue method: " + x);
        changevalue(x);
        System.out.println("Value of x after calling changevalue method: " + x);
    }
}