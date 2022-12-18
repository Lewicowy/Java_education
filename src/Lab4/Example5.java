package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);
        Random rand = new Random();
        int k, k1;
        System.out.print("Задайте размер строк массива: ");
        k = jo.nextInt();
        System.out.print("Задайте размер столбцов массива: ");
        k1 = jo.nextInt();
        int[][] twoArr = new int[k][k1];
        int[][] twoArr2 = new int[k1][k];

        System.out.print("\nИзначальная матрица:\n");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k1; j++) {
                twoArr[i][j] = rand.nextInt(10);
                System.out.print(twoArr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\nТранспонированная матрица:\n");
        for (int i = 0; i < k1; i++) {
            for (int j = 0; j < k; j++) {
                twoArr2[i][j] = twoArr[j][i];
                System.out.print(twoArr2[i][j]);
            }
            System.out.print("\n");
        }
    }
}