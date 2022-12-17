package Lab4;

public class Example2 {
    public static void main(String[] args) {
        int i, j, ky = 5;
        String k1=" ", k=" ", y="_", y1="_";

        for (i = 0; i < ky; i++) {
            if (i == 0) {
                System.out.println("|"+"\\");
            } else {
                for (j = 4; j < ky; j++) {
                    if (i < 4) {
                        System.out.println("|"+k+"\\");
                    } else if (j == 4){
                            System.out.print("|"+y+"\\");
                        }
                    }
                k = k + k1;
                y = y + y1;
            }
        }
    }
}