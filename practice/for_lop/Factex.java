public class Factex {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        int result;
        for (int i = 1; i <= 100; i++) {
            fact = fact * i;

            System.out.println(fact);

        }
        result = num * fact;
        System.out.println(result);
    }
}
