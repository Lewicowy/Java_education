package Lab1;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float first, second, sum = 0;

        System.out.print("Введите первое число: ");
        first = in.nextFloat();
        System.out.print("Введите второе число: ");
        second = in.nextFloat();

        sum = first + second;

        System.out.println("Ответ: " + sum);
    }
}
