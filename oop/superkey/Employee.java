class employe {
    int salary = 30000;
}

class manger extends employe {
    int salary = 6000;

    void details() {
        System.out.println("manger salary" + salary);
        System.out.println("salary employee" + super.salary);

    }
}

public class Employee {
    public static void main(String[] args) {
        manger emp = new manger();
        emp.details();

    }
}
