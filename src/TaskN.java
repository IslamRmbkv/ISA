import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int Minutes = 540 + n * 45 + (n / 2) * 5 + ((n - 1) / 2) * 15;

        int hours = Minutes / 60;
        int min = Minutes % 60;

        System.out.println(hours + " " + min);
    }
}
