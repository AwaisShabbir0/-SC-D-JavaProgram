package Lab02;
import java.util.Scanner;
public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Welcome " + name + "! You are " + age + " years old.");
        sc.close();
    }
}
