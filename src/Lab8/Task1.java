package Lab8;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("Test.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Created");
                System.out.println("Полный путь первый: " + f1.getAbsolutePath());
            }
            File f2 = new File("/tmp/Test.txt");
            f2.createNewFile();
            System.out.println("Полный путь второй: " + f2.getAbsolutePath());
            File f3 = new File("/tmp/File1/File2/File3");
            f3.mkdirs();
            System.out.println("Полный путь третий: " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Warning. " + e);
        }
    }
}
