import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int t = scanner.nextInt();

        int distance = v * t;

        int position = (distance % 109 + 109) % 109;

        System.out.println(position);

    }
}
