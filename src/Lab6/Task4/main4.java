package Lab6.Task4;

import java.util.Random;

public class main4 {
    public static void main(String[] args) {
        Random random = new Random();
        Task4 f = new Task4();
        int n = random.nextInt(10);
        System.out.println("Число: " + n);
        int factorial1 = f.dualfac2(n);
        int factorial2 = f.dualfac1(n);
        System.out.println("Двойной факториал числа без рекурсии: " + factorial1);
        System.out.println("Двойной факториал числа с рекурсией: " + factorial2);
    }
}
