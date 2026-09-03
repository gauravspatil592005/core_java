
class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("print para constructor");
    }

    Student(Student noStudent) {
        this.name = name;
        this.roll = roll;
        System.out.println("print para constructor");

    }

    void display() {
        System.out.println("name of student" + name + "student roll no" + roll);

    }

}

public class practice {
    public static void main(String[] args) {
        Student student1 = new Student("yogesh", 78);
        student1.display();
        Student student2 = new Student(student1);
        // student2.name="yogesh";
        // student2.roll=27;

        student2.display();

    }
}
