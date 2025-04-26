import java.io.*;

public class Problem6 {
    public static void processData() throws IOException {
        throw new IOException("Checked exception occurred");
    }

    public static void processDataUnchecked() {
        throw new RuntimeException("Unchecked exception occurred");
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            processDataUnchecked();
        } catch (RuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
