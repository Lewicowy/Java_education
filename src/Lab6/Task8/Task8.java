package Lab6.Task8;

public class Task8 {
    static double arg(int arr[]){
        int sum = 0;
        for (int i = 0 ; i <arr.length; i++){
            sum += arr[i];
        }
        double res = (double)sum/arr.length;
        return res;
    }
}
