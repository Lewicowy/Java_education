package Lab4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        int i, j, k, k1;
        System.out.print("Введите кол-во строк массива: ");
        k = jo.nextInt();
        System.out.print("Введите кол-во столбцов массива: ");
        k1 = jo.nextInt();
        int[][] arr = new int[k][k1];

        int m = 1;
        for (i = 0; i < k1; i++) {
            arr[0][i] = m;
            m++;
        }
        for (j = 1; j < k; j++) {
            arr[j][k1-1] = m;
            m++;
        }
        for (i = k1-2; i >= 0; i--) {
            arr[k-1][i] = m;
            m++;
        }
        for (j = k-2; j > 0; j--) {
            arr[j][0] = m;
            m++;
        }
        int c = 1, v = 1, n = m;
        while (n < k * k1) {
            while (arr[c][v + 1] == 0) {
                arr[c][v] = m;
                m++;
                v++;
            }
            while (arr[c + 1][v] == 0) {
                arr[c][v] = m;
                m++;
                c++;
            }
            while (arr[c][v - 1] == 0) {
                arr[c][v] = m;
                m++;
                v--;
            }
            while (arr[c - 1][v] == 0) {
                arr[c][v] = m;
                m++;
                c--;
            }
            n++;
        }
        for (i = 0; i < k; i++) {
            for (j = 0; j < k1; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = m;
                }
            }
        }
        for (i = 0; i < k; i++) {
            for (j = 0; j < k1; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
