class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("constructor excuted");

    }

    void display() {
        System.out.println("name of emp" + name + "emp salary" + salary);
    }
}

    public class  {
        public static void main(String[] args) {
            Employee obj = new Employee("yogesh", 8000.59);
            obj.display();

        }
    }

