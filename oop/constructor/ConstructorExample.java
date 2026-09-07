class Employee {
    String name;
    double salary;

    // Parameterized Constructor
    // Used to initialize an object with given values
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        System.out.println("Parameterized constructor executed");
    }

    // Copy Constructor
    // Used to create a new object by copying data from another object
    Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;

        System.out.println("Copy constructor executed");
    }

    // Method to display employee details
    void display() {
        System.out.println("Name of employee: " + name);
        System.out.println("Employee salary: " + salary);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {

        // Calling Parameterized Constructor
        Employee emp1 = new Employee("Yogesh", 8000.59);
        emp1.display();

        // Calling Copy Constructor
        // emp2 gets the same name and salary as emp1
        Employee emp2 = new Employee(emp1);
        emp2.display();
    }
}