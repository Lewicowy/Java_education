package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);
        Random rand = new Random();

        int k, k1, y, y1;
        System.out.print("Задайте размер строк массива: ");
        k = jo.nextInt();
        System.out.print("Задайте размер столбцов массива: ");
        k1 = jo.nextInt();
        y = rand.nextInt(k);
        y1 = rand.nextInt(k1);
        int[][] twoArr = new int[k][k1];
        int[][] twoArr2 = new int[k][k1];

        System.out.print("\nИзначальная матрица:\n");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k1; j++) {
                twoArr[i][j] = rand.nextInt(10);
                System.out.print(twoArr[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k1; j++) {
               if (i != y && j != y1) {
                   twoArr2[i][j] = twoArr[i][j];
                }
            }
        }
        System.out.print("\nМатрица без "+ y + "-ой строки и " + y1 + "-го столбца:\n");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k1; j++) {
                System.out.print(twoArr2[i][j]);
            }
            System.out.print("\n");
        }
    }
}
