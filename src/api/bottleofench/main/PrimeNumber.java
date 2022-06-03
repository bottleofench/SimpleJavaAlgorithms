package api.bottleofench.main;

import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Внимание: присутствует большая погрешность на проверке при больших числах!");
        System.out.println("Введите число, которые вы хотите проверить на то, является ли оно простым:");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        boolean prime = true;
        List<Long> simple_prime_numbers = List.of(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L);

        if (!simple_prime_numbers.contains(number)) {
            for (long i : simple_prime_numbers) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        System.out.println("Результат: " + prime);
    }
}
