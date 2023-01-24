package Lab6.Task6;

public class Task6 {
    private static int arr2[];
    static int[] array(int arr1[], int n) {
        if (n > arr1.length) {
            n = arr1.length;
        }
        arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }
        // возвращает ссылку на новый массив
        return arr2;
    }
    static void view()
    {
        for (int i = 0; i < Task6.arr2.length; i++) {
            System.out.println("arr[" + i + "] = " + arr2[i]);
        }
    }
}
