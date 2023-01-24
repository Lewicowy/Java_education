package Lab5;

import java.util.Random;

public class main3 {
    public static void main(String[] args) {
            Random random = new Random();
            int a = random.nextInt(10);
            System.out.println("Первое число: " + a);
            int b = random.nextInt(10);
            System.out.println("Второе число: " + b);
            Task3 n1 = new Task3();
            Task3 n2 = new Task3(a);
            Task3 n3 = new Task3(a,b);
    }
}
