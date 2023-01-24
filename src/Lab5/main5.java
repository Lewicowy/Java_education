package Lab5;

public class main5 {
    public static void main(String[] args) {
        Task5 n = new Task5(3);
        System.out.println(n.getN());
        n.Set(5);
        System.out.println(n.getN());
        n.Set(101);
        System.out.println(n.getN());
        n.Set(12);
        System.out.println(n.getN());
        n.Set();
        System.out.println(n.getN());
    }
}
