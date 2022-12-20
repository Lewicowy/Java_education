package Lab4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        int i, j, k, k1,l,l1;
        System.out.print("Введите кол-во строк массива: ");
        k = jo.nextInt();
        System.out.print("Введите кол-во столбцов массива: ");
        k1 = jo.nextInt();
        int[][] arr = new int[k][k1];
        l = 0; l1 = k1-1;
        /*Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее*/
        int m = 0;
        for (i = 0; i < k; i++) {
            if (i == 0) {
                for (j = 0; j < k1; j++) {
                arr[i][j] = m;
                m++;
                System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
