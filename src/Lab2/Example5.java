package Lab2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = jo.nextInt();

        if (num < 10000) {
            num /= 1000;
            System.out.print("Число содержит: " + num + " тысяч(у)");
        } else if (num > 9999) {
            int num_ost;
            num /= 1000;
            num_ost = num % 10;
            System.out.print("Число содержит: " + num_ost + " тысяч(у)");
        }
    }
}
