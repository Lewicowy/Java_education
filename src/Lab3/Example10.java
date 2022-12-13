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

        for (int i = 0; i < n; ++i) {
            int max = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int a = arr[max];
            arr[max] = arr[i];
            arr[i] = a;
        }
        System.out.print("\nСортировка массива в порядке убывания: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}