abstract class vehicle {
    int notyres;

    void displaytyre() {
        System.out.println("no of tyre" + notyres);
    }

    abstract void start();
}

class car extends vehicle {
    void start() {
        notyres = 4;
        System.out.println("car is strat with key");
    }
}

class bike extends vehicle {
    void start() {
        notyres = 2;
        System.out.println("bike is start with key");
    }

}

public class Motar {
    public static void main(String[] args) {
        vehicle v1 = new car();

        v1.start();
        v1.displaytyre();

        vehicle obj = new bike();
        obj.start();
        obj.displaytyre();

    }
}