import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int minDay = n % 1440;
        int hours = minDay / 60;
        int min = minDay % 60;

        System.out.println(hours + " " + min);
    }
}
