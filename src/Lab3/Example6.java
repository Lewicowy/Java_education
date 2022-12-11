package Lab3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = jo.nextInt(), a = 2;
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            if (a % 5 == 2) {
                arr[i] = a;
            }
            a += 5;
        }
        System.out.print("Числа, которые делятся: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
