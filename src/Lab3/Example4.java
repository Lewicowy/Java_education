package Lab3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        int n, n1;
        System.out.print("Введите первое число: ");
        n = jo.nextInt();
        System.out.print("Введите второе число: ");
        n1 = jo.nextInt();
        System.out.print("Диапозон чисел: ");
        for (int i = n; i <= n1; ++i) {
            System.out.print(n + " ");
            n = n + 1;
        }
    }
}
