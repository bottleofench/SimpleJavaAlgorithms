package api.bottleofench.main;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Введите число, факториал которого вы хотите получить:");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long output = 1;
        for (long i = 1; i <= number; i++) output *= i;
        System.out.println(output);
    }
}
