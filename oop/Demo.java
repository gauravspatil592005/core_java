class Dog {
    String name;
    String colour;

    void bark() {
        System.out.println(colour + name + " bark");
        // System.out.println(name + " bark");
    }
}

public class Demo {
    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.name = "Tom";
        obj.colour = "black";
        obj.bark();
    }
}
