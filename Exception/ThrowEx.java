public class ThrowEx {
    public static void main(String[] args) throws Exception {
        int age1 = 15;
        int age2 = 19;
        // if (age < 18) {
        // throw new ArithmeticException("Not eligible to vote");
        // }
        //
        int res = age1 / age2;
        System.out.println(res);
    }
}
