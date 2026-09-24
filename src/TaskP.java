import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();

        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        int sec1 = h1 * 3600 + m1 * 60 + s1;
        int sec2 = h2 * 3600 + m2 * 60 + s2;

        int diffr = sec2 - sec1;
        System.out.println(diffr);

    }
}
