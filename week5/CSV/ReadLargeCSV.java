package Day1;
import java.io.*;

public class ReadLargeCSV {
    public static void main(String[] args) {
        String filePath = "largefile.csv";
        int chunkSize = 100;
        int totalCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while (true) {
                int count = 0;
                while (count < chunkSize && (line = br.readLine()) != null) {
                    count++;
                    totalCount++;
                }
                if (count == 0) break;
                System.out.println("Processed " + totalCount + " records");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
