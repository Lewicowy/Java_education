package Lab6.Task4;

public class Task4 {
    public static int dualfac1(int num)
    {
        if (num == 0 || num == 1)
            return 1;

        return num * dualfac1(num - 2);
    }
    public static int dualfac2(int num) {
        int res = 1;
        for (int i = num; i >= 0; i = i-2)
        {
            if (i == 0 || i == 1)
                return res;
            else
                res *= i;
        }
        return res;
    }
}
