package Lab2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         float num;
         System.out.print("Число, которое будем делить: ");
         num = in.nextFloat();

         if (num % 5 == 2 && num % 7 == 1) {
             System.out.print("Условие верно");
         } else {
             System.out.print("Условие неверно");
         }
    }
}
