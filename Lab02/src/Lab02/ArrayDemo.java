package Lab02;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 76};

        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        // Average
        int total = 0;
        for (int m : marks) total += m;
        System.out.println("Average: " + total / marks.length);
    }
}
