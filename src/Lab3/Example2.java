package Lab3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        String week;
        System.out.print("Введите день недели: ");
        week = jo.nextLine();
        switch (week) {
            case "Понедельник": System.out.print("Число недели: 1"); break;
            case "Вториник": System.out.print("Число недели: 2"); break;
            case "Среда": System.out.print("Число недели: 3"); break;
            case "Четверг": System.out.print("Число недели: 4"); break;
            case "Пятница": System.out.print("Число недели: 5"); break;
            case "Суббота": System.out.print("Число недели: 6"); break;
            case "Воскресенье": System.out.print("Число недели: 7"); break;
            default: System.out.print("Неккоректные данные");
        }
    }
}
