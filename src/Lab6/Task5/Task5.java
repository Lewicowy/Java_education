package Lab6.Task5;

public class Task5 {
    static int rekurs1(int num)
    {
        int res = 0;
        for (int i = 1; i <= num; i++)
            res += (int)(Math.pow(i, 2));
        return res;
    }
    static int rekurs2(int num)
    {
        if (num <= 1)
            return num;
        else
            return rekurs2(num - 1) + num * num;
    }
}
