package Lab2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float num;
        System.out.print("Введите число: ");
        num = in.nextFloat();

        if (num % 3 == 0) {
            System.out.print("Число делится на 3!");
        } else {
            System.out.print("Число не делится на 3!");
        }
    }
}
