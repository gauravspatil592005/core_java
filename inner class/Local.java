class outer {
    void show() {
        class inner {
            void method() {
                System.out.println("Hello");
            }
        }
        inner in = new inner();
        in.method();
    }
}

public class Local {
    public static void main(String args[]) {
        outer out = new outer();

        out.show();

    }
}