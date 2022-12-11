package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = jo.nextInt();
        int arr[] = new int[n];
        Random ran = new Random();

        System.out.print("Числа в массиве: ");
        for (int j = 0; j < n; j++) {
            arr[j] = ran.nextInt(100);
            System.out.print(arr[j] + " ");
        }
        int id = 1;
        int min = arr[1];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                id = i;
            }
        }
        System.out.print("\nИндекс " + id + ": элемент массива " + min);
    }
}
