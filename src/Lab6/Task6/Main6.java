package Lab6.Task6;

public class Main6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("Второй аргумент меньше длины массива");
        Task6 array = new Task6();
        for (int i = 0; i < array.array(arr1, 6).length; i++) {
            System.out.println("arr[" + i + "] = " + array.array(arr1, 6)[i]);
        }
        System.out.println("Второй аргумент больше длины массива");
        Task6.array(arr1, 22);
        Task6.view();
    }
}
