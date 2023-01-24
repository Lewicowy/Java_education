package Lab8;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            File f1 = new
                    File("/tmp/numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл? ");
            int count = sc.nextInt();
            System.out.println("Введите числа: ");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
                wr.flush();
                wr.close();
            }
            File f2 = new File("/tmp/numRez.txt");
            f2.createNewFile();

            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число " + (float) number);
                }
            } catch (EOFException e) {
            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("Конец файла");
        }
    }
}
