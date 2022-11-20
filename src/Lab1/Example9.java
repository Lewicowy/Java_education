package Lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k_date; String month, d;

        System.out.print("Введите Месяц: ");
        month = in.nextLine();
        System.out.print("Введите Количество дней в текущем месяце: ");
        k_date = in.nextInt();
        if (k_date == 31) {
            d = "день";
        } else {
            d = "дней";
        }

        System.out.print("В текущем месяце " + month + " - " + k_date + " " + d);
    }
}
