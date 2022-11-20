package Lab1;

import java.util.Scanner;

public class Example10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int year, year1;
            float num = 0;
            String age;

            System.out.print("Введите свой год рождения: ");
            year = in.nextInt();
            System.out.print("Введите текущий год: ");
            year1 = in.nextInt();

            year -= year1;

            if (num == 1 || num % 10 == 1) {
                age = "год";
                if (num > 1 && num < 4) {
                    age = "года";
                }
                if (num > 4) {
                    age = "лет";
                }
            }

            //System.out.println("Вам: " + year + age);
        }
    }
