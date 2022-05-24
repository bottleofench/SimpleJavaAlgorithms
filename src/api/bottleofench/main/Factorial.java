package api.bottleofench.main;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Введите число, факториал которого вы хотите получить:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int output = 1;
        for (int i = 1; i <= number; i++) output *= i;
        System.out.println(output);
    }
}
