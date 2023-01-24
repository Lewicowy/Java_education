package Lab5.Task5;

public class Task5 {
    private int n;
    public void Set(int count) {
        System.out.println("Метод c аргументом ");
        n = count;
        if (count >= 100) {
            this.n = 100;
        }
        else if (count < 0) {
            this.n = 0;
        }
    }
    public void Set() {
        System.out.println("Метод без аргумента ");
        this.n = 0;
    }
    Task5(int number) {
        System.out.println("Конструктор: ");
        this.Set(number);
    }
    public int getN() {
        return n;
    }
}
