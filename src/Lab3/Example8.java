package Lab3;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner jo = new Scanner(System.in);

        String abc = "BCDFGHJKLMNPQRSTVWXYZ";
        char n = 10;
        char alf[] = new char[n];

        System.out.print("Согласные буквы: " + abc);
        System.out.print("\nПервые 10 согласных букв: ");
        for (int i = 0; i < 10; i++) {
            alf[i] = abc.charAt(i);
            System.out.print(alf[i]);
            }
        }
    }
