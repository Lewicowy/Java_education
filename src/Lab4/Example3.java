package Lab4;

public class Example3 {
    public static void main(String[] args) {
        int i, j;
        int[][] twoArr = {{2,2,2,2},{2,2,2,2},{2,2,2,2}};

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(twoArr[i][j]);
            }
            System.out.print("\n");
        }
    }
}