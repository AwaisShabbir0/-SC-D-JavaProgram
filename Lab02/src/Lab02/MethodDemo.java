package Lab02;
public class MethodDemo {
    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Awais");
        System.out.println("Sum: " + add(10, 5));
    }
}
