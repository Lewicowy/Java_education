package Lab6.Task1;

public class Main {
    public static void main(String[] args) {
        Task1 c = new Task1();
        c.Set('D');
        c.Set ("Hello world!");

        char[] Array1 = {'M'};
        char[] Array2 = {'H','e','l','l','o'};

        c.Set(Array1);
        c.Set (Array2);

    }
}
