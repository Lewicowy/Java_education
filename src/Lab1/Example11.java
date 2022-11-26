package Lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year, year1, num, num_l;
        String name;

        System.out.print("Введите своё имя: ");
        name = in.nextLine();
        System.out.print("Введите свой год рождения: ");
        year = in.nextInt();
        System.out.print("Введите текущий год: ");
        year1 = in.nextInt();

        num = year1 - year;
        num_l = num % 10;
        String age = "";
        boolean ex = (num % 100 >= 11) && (num % 100 <= 14);

        if (num_l == 1) {
            age = "год";
        } else if (num_l == 0 || num_l >= 5 && num_l <= 9) {
            age = "лет";
        } else if (num_l >= 2 && num_l <= 4) {
            age = "года";
        }
        if (ex) {
            age = "лет";
        }

        System.out.println("Ваши данные: " + name + ", " + num + " " + age);
    }
}
