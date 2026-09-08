
class calculator {
    // public int add(int a, int b) {
    // return a + b;

    // }

    // public int add(int a, int b, int c) {
    // return a + b + c;

    // }

    // public double add(double a, double b, double c) {
    // return a + b + c;

    // }

    // public double add(double a, double b) {
    // return a + b;

    // }
    public int add(int a, int b) {
        return a - b;

    }

    public int add(int a, int b, int c) {
        return a + b + c;

    }

    public double add(double a, double b, double c) {
        return a + b + c;

    }

    public double add(double a, double b) {
        return a * b;

    }

}

public class Overloadi_ex {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.add(5, 6));
        System.out.println(cal.add(5, 6, 7));
        System.out.println(cal.add(5, 6));
        System.out.println(cal.add(5.0, 9.0
        ));

    }
}
