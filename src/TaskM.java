import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);
    }
}
