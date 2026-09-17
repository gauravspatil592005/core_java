public class Tryex {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int res = a * b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
        System.out.println("End of program.");
    }
}