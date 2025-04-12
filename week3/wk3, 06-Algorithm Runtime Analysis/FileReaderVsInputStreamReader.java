import java.io.*;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) throws Exception {
        String filePath = "largefile.txt"; // Replace with 500MB test file

        long start = System.nanoTime();
        FileReader fr = new FileReader(filePath);
        while (fr.read() != -1);
        fr.close();
        System.out.println("FileReader Time: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        while (isr.read() != -1);
        isr.close();
        System.out.println("InputStreamReader Time: " + (System.nanoTime() - start) / 1e6 + " ms");
    }
}