public class Main {
    // without return type
    // void displaymsg() {
    // System.out.println("this msg print");
    // System.out.println("this msg print");
    // }
    // with return type this example for with paramters
    // int add() {
    // int a = 4;
    // int b = 5;
    // int result = a + b;
    // return result;
    // }
    // with paramters
    // int add(int num1,int num2){
    // int result=num1+num2;
    // return result;
    // }
    // static method
    static int add(int num1,int num2){
        int result=num1+num2;
        return result;
    }
    public static void main(String[] args) {
        // Main obj = new Main();
        // System.out.println(obj.add(4,5));
        System.out.println(add(4, 5));
    }

}
