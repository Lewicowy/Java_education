package Lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String week, month; int date;

        System.out.print("Введите День недели: ");
        week = in.nextLine();
        System.out.print("Введите Месяц: ");
        month = in.nextLine();
        System.out.print("Введите Номер дня в месяце: ");
        date = in.nextInt();

        System.out.println("Сегодняшняя дата: " + week + ',' + ' ' + date + ',' + ' ' + month + '.');
    }
}
