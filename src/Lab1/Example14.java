package Lab1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float num, n1, n2, n3;

        System.out.print("Введите число: ");
        num = in.nextFloat();

        n1 = num - 1;
        n2 = num + 1;
        n3 = (n1 + n2 + num);
        n3 *= n3;

        System.out.println("Число меньшее на единицу: " + n1 + "\nСамо число: " + num + "\nЧисло большее на единицу: "
                + n2 + "\nСумма трёх чисел в квадрате: " + n3);

    }
}
