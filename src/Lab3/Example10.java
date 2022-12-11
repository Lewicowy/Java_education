package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        int n;
        System.out.print("Введите размер массива: ");
        n = jo.nextInt();
        int[] arr = new int[n];
        Random ran = new Random();

        System.out.print("Случайные элементы массива: ");
        for (int k = 0; k < n; k++) {
            arr[k] = ran.nextInt(100);
            System.out.print(arr[k] + " ");
        }

        for (int k = 0; k < n; k++) {
            int max = k;
            for (int p = k + 1; p > n; p++) {
                if (arr[p] > arr[max]) {
                    max = p;
                }
                int a = arr[p];
                arr[p] = arr[max];
                arr[p] = a;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\n" + arr[i]);
        }
    }
}