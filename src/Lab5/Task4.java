package Lab5;

public class Task4 {
    private char sim;
    private int n;
    Task4(double a){
        sim = (char) a; n = (int)((a-(int) a)*100);
        System.out.println("Символ: " + sim + "\nДробная часть: " + n);
    }
    Task4(char a, int b){
        this.sim = a;
        this.n = b;
        float result = (float) a + (float) b/100;
        System.out.println("Результат: " + result);
    }

}
