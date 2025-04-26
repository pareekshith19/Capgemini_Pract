import java.io.*;

public class Problem2 {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt";
        String destFile = "copied_largefile.txt";

        long startTime, endTime;

        // Using unbuffered streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            startTime = System.nanoTime();
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            endTime = System.nanoTime();
            System.out.println("Unbuffered File Copy Time: " + (endTime - startTime) / 1e6 + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using buffered streams
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            startTime = System.nanoTime();
            int byteRead;
            while ((byteRead = bis.read()) != -1) {
                bos.write(byteRead);
            }
            endTime = System.nanoTime();
            System.out.println("Buffered File Copy Time: " + (endTime - startTime) / 1e6 + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
