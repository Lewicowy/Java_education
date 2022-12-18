package Lab4;

public class Example4 {
    public static void main(String[] args) {
        int i, j;
        char[][] twoArr = {{'+',' ',' ',' '},{'+','+',' ',' '},{'+','+','+',' '},{'+','+','+','+'}};

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(twoArr[i][j]);
            }
            System.out.print("\n");
        }
    }
}
