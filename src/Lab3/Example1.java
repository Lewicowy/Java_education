package Lab3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        String day;
        System.out.print("Введите число от 1 до 7: ");
        day = jo.nextLine();
        switch (day) {
            case "1": System.out.print("Понедельник"); break;
            case "2": System.out.print("Вторник"); break;
            case "3": System.out.print("Среда"); break;
            case "4": System.out.print("Четверг"); break;
            case "5": System.out.print("Пятница"); break;
            case "6": System.out.print("Суббота"); break;
            case "7": System.out.print("Воскресенье"); break;
            default: System.out.print("Неккоректные данные");
        }
    }
}
