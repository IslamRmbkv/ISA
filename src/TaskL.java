import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int hours = (n / 3600) % 24;
            int min = (n % 3600) / 60;
            int sec = n % 60;

            System.out.printf("%d:%02d:%02d\n", hours, min, sec);
        }

    }
}