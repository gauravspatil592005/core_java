
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println(" para constructor excuted");

    }
      Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println(" copy constructor excuted");

    }

    void display() {
        System.out.println("name of emp" + name + "emp salary" + salary);
    }
}

    public class ConstructorExample {
        public static void main(String[] args) {
            Employee emp1 = new Employee("yogesh", 8000.59);
            emp1.display();
              Employee emp2 = new Employee(emp1);
            emp2.display();

        }
    }

