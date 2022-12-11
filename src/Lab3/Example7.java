package Lab3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        int j=9;
        char arr[] = {'A', 'C', 'E', 'G', 'I', 'K', 'M', 'O', 'Q', 'S'};

        System.out.print("Массив в прямом порядке: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nМассив в обратном порядке: ");
        while (j >= 0) {
            System.out.print(arr[j] + " ");
            j = j - 1;
        }
    }
}
