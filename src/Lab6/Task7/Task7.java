package Lab6.Task7;

public class Task7 {
    static int[] arr;
    static int[] SetArr(char charr[]) {
        arr = new int[charr.length];
        for (int i = 0; i < charr.length; i++) {
            arr[i] = (int)charr[i];
        }
        return arr;
    }
    static void view() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
