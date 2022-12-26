package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);
        String text, choice;
        int key;

        System.out.print("Введите текст для шифрования: ");
        text = jo.nextLine();
        System.out.print("Введите ключ: ");
        key = jo.nextInt();

        char[] chars = text.toCharArray();
        int[] ints = new int[text.length()];

        System.out.print("Текст до преобразования: " + Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key;
            chars[i] = (char)ints[i];
        }
        System.out.print("\nТекст после преобразования: " + Arrays.toString(chars));

        System.out.print("\nВыполнить обратное преобразование? (y/n): ");
        choice = jo.nextLine();

        for(int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - key;
            chars[i] = (char)ints[i];
        }
        System.out.print("\nТекст до преобразования: " + Arrays.toString(chars));
    }
}