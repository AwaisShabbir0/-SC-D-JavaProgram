package Lab02;
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Awais";
        s1.age = 20;
        s1.display();
    }
}
