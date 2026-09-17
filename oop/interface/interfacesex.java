interface vehicle {
    void start();

    void stop();

}

class car implements vehicle {
    public void start() {
        System.out.println("car started");
    }

    public void stop() {
        System.out.println("car stopped");
    }
}

public class interfacesex {
    public static void main(String args[]) {
        vehicle v = new car();
        v.start();
        v.stop();
    }
}