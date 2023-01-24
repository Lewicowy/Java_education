package Lab5;

public class Task6 {
    private int max;
    private int min;
    public void resul(int x, int y) {
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
    }
    public void resul(int x) {
        if (x < min) {
            min = x;
        } else {
            max = x;
        }
    }
    Task6(int x, int y) {
        resul(x,y);
    }
    Task6(int x) {
        resul(x);
    }
    public void resul2() {
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
