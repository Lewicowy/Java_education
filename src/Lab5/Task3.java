package Lab5;

public class Task3 {
    private int int1, int2;
    Task3(){
        System.out.println("Конструктор без аргументов");
    }
    Task3(int a){
        this.int1 = a;
        System.out.println("Конструктор сложения: " + pos(a) + " (один аргумент)");
    }
    public int pos(int a){
        this.int2 = a;
        int res = a + a;
        return res;
    }
    Task3(int a,int b){
        this.int1 = a;
        this.int2 = b;
        System.out.println("Конструктор умножения: " + blend(int1,int2) + " (два аргумента)");
    }
    public int blend(int a, int b){
        int res = a * b;
        return res;
    }
}
