package Lab8;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("/tmp/MyFile1.txt"), StandardCharsets.UTF_8));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("/tmp/MyFile2.txt"), StandardCharsets.UTF_8));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!" + e);
        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }
}
