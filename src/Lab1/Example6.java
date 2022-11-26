package Lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstname, lastname, patronymic;

        System.out.print("Введите свою Фамилию: ");
        lastname = in.nextLine();
        System.out.print("Введите своё Имя: ");
        firstname = in.nextLine();
        System.out.print("Введите своё Отчество: ");
        patronymic = in.nextLine();

        System.out.println("Фамилия: " + lastname);
        System.out.println("Имя: " + firstname);
        System.out.println("Отчество: " + patronymic);
    }
}
