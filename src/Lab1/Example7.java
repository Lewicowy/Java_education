package Lab1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name; int age;

        System.out.print("Введите своё Имя: ");
        name = in.nextLine();
        System.out.print("Введите свой Возвраст: ");
        age = in.nextInt();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
