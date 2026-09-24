import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем целое число
        int n = scanner.nextInt();

        // Выводим текст для следующего и предыдущего чисел
        System.out.printf("The next number for the number %d is %d.%n", n, n + 1);
        System.out.printf("The previous number for the number %d is %d.%n", n, n - 1);

        scanner.close();
    }
}