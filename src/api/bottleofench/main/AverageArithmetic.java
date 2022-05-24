package api.bottleofench.main;

import java.util.Scanner;

public class AverageArithmetic {
    public static void main(String[] args) {
        System.out.println("Введите число, обозначающее кол-во чисел на входе:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите все числа, ср. ариф. которых вы хотите получить:");
        float sum = 0;
        for (int i = 0; i < number; i++) {
            int g = scanner.nextInt();
            sum += g;
        }
        float average_arithmetic = sum / number;
        System.out.println("Ср. арифм. = " + average_arithmetic);
    }
}
