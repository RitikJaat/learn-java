class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing.............");
    };

    public void printColor() {
        System.out.println(this.color);
    };
};

class Student {
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    };

    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // };
    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    };

    Student(){
        // default constructor
    };
};

public class OOPS {
    public static void main(String[] args) {

        // Pen p1 = new Pen();
        // p1.color = "Black";
        // p1.type = "Gelpen";

        // Pen p2 = new Pen();
        // p2.color = "Blue";
        // p2.type = "Ballpoint pen";

        // p1.printColor();
        // p2.printColor();

        // Student s1 = new Student(); // new student() is a constructor & will called.
        // s1.name = "Lol";
        // s1.age = 15;
        // s1.introduction();

        // Student s2 = new Student();
        // s2.name = "Lolol";
        // s2.age = 15 + 3;
        // s2.introduction();

        // Student s1 = new Student("lol0l", 20);

        // copy constructor
        Student s1 = new Student();
        s1.name = "okey";
        s1.age = 16;
        s1.printinfo();

        Student s2 = new Student(s1);
        s2.printinfo();

    }
}
