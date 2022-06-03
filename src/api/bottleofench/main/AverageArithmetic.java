package api.bottleofench.main;

import java.util.Scanner;

public class AverageArithmetic {
    public static void main(String[] args) {
        System.out.println("Введите число, обозначающее кол-во чисел на входе:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите все числа, ср. ариф. которых вы хотите получить:");
        System.out.println("Ср. арифм. = " + aa(number));
    }

    static float aa(int number) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int i = 0;
        while (i < number) {
            int g = scanner.nextInt();
            sum += g; i++;
        }
        return sum / number;
    }
}
