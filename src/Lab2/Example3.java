package Lab2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        System.out.print("Введите число: ");
        float num = jo.nextFloat();

        if (num % 4 == 0 && num > 10) {
            System.out.print("Условие верно");
        } else {
            System.out.print("Условие неверно");
        }
    }
}
