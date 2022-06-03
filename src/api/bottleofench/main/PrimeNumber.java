package api.bottleofench.main;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Внимание: присутствует большая погрешность на проверке при больших числах!");
        System.out.println("Введите число, которые вы хотите проверить на то, является ли оно простым:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Результат: " + isPrime(number));
    }

    static boolean isPrime(int number) {
        int dividers = 0;
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                dividers++;
            }
            i++;
        }
        return dividers == 2;
    }
}
