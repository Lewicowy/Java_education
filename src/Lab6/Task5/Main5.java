package Lab6.Task5;

public class Main5 {
    public static void main(String[] args) {
        Task5 summa = new Task5();
        int a = summa.rekurs1(37);
        int b = summa.rekurs2(27);
        System.out.println("Рекурсивный: " + a);
        System.out.println("Не рекурсивный: " + b);
    }
}
