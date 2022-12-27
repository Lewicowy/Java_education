package Lab4;

public class Example1 {
    public static void main(String[] args) {
        byte i, j, k, figure = 10;

        for (i = -1; i < figure; i++) {
            if ((i == -1) || (i == figure)) {
                for (j = -14; j <= figure; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                System.out.print("+");
                for (k = -13; k < figure; k++) {
                    System.out.print(" ");
                }
                System.out.println("+");
            }
        }
        for (j = -15; j < figure; j++) {
            System.out.print("*");
        }
    }
}