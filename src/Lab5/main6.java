package Lab5;

public class main6 {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.print("Метод с двумя аргументами: \n");
        Task6 task6 = new Task6(55, 64);
        task6.resul2();
        System.out.print("Метод c одним аргументом: \n");
        task6 = new Task6(48);
        task6.resul2();
        System.out.print("Метод с двумя аргументами: \n");
        task6.resul(6, 10);
        task6.resul2();
        System.out.print("Метод c одним аргументом: \n");
        task6.resul(9);
        task6.resul2();

    }
}
