package Lab2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        System.out.print("Введите число: ");
        float num = jo.nextFloat();

        if (num >= 5 && num <= 10) {
            System.out.print("Число входит в диапазон");
        } else {
            System.out.print("Число не входит в диапазон");
        }
    }
}
