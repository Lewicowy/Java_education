package Lab3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        int n, num = 0, sum = 0;
        System.out.print("Введите размер массива: ");
        n = jo.nextInt();
        int[] bik = new int[n];
        System.out.println("Введите числа в массив");
        for (int i = 0; i < n; i++) {
            System.out.print("Индекс " + num + ": ");
            num += 1;
            bik[i] = jo.nextInt();
            sum += bik[i];
        }
        System.out.println("Сумма чисел массива: " + sum + ".");
        if (sum % 5 == 2 || sum % 3 == 1) {
            System.out.print("Сумма чисел делится на 5 или на 3.");
        } else {
            System.out.print("Сумма чисел не делится.");
        }
    }
}
