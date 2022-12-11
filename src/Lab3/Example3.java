package Lab3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        int n;
        System.out.print("Введите число: ");
        n = jo.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print("Числа Фибоначчи: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        /*int fibc1 = 1, fibc2 = 1, fib_x, i = 0;
        int n = jo.nextInt();
        System.out.print("Числа фибоначчи: " + fibc1 + " " + fibc2 + " ");
        while (i < n - 2) {
            fib_x = fibc1 + fibc2;
            fibc1 = fibc2;
            fibc2 = fib_x;
            i++;
            System.out.print(fibc2 + " ");
        }*/
    }
}
