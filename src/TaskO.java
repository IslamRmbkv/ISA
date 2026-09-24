import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int w = a * 100 + b;

        int kop = w * n;

        int rub = kop / 100;
        int wkop = kop % 100;

        System.out.println(rub + " " + wkop);
    }
}
