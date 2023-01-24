package Lab7.Task5;

public class main {
    public static void main(String[] args) {
        System.out.println(new SuperClass5("Тест"));
        System.out.println(new SuperClass51("Тест", 'X'));
        System.out.println(new SuperClass511("Тест", 42));
        var x = (SuperClass5) new SuperClass511("Тест", 42);
        System.out.println(x);
    }
}
