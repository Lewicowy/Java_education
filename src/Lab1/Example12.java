package Lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year, age;

        System.out.print("Введите свой возраст: ");
        age = in.nextInt();
        System.out.print("Введите текущий год: ");
        year = in.nextInt();

        year = year - age;

        System.out.println("Ваш год рождения: " + year + " г.");
    }
}
