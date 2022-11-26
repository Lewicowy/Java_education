package Lab1;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float first, second, num1, num2;

        System.out.print("Введите первое число: ");
        first = in.nextInt();
        System.out.print("Введите второе число: ");
        second = in.nextInt();

        num1 = first + second;
        num2 = first - second;

        System.out.println("Сумма чисел равна: " + num1 + "\nРазность чисел равна: " + num2);
    }
}
