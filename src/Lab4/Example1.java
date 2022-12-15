package Lab4;

public class Example1 {
    public static void main(String[] args) {

        int l = 0, i, j, k=0, figure = 10;
        for (i = -14; i < figure; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        for (i = -1; i < figure; i++) {
            l = l + 1;
            System.out.print("+");
            for (j = -12; j < figure; j++) {
                System.out.print(" ");
                k = k + 1;
            }
            System.out.println("+");
        }
        for (i = -14; i < figure; i++) {
            System.out.print("*");
        }
    }
}
