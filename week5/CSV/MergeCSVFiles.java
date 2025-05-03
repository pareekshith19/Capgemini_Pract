package Day1;
import java.io.*;
import java.util.*;

public class MergeCSVFiles {
    public static void main(String[] args) {
        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";
        Map<String, String[]> map1 = new HashMap<>();
        Map<String, String[]> map2 = new HashMap<>();
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {
            br1.readLine();
            String line;
            while ((line = br1.readLine()) != null) {
                String[] columns = line.split(",");
                map1.put(columns[0], new String[]{columns[1], columns[2]});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
            br2.readLine();
            String line;
            while ((line = br2.readLine()) != null) {
                String[] columns = line.split(",");
                map2.put(columns[0], new String[]{columns[1], columns[2]});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("ID,Name,Age,Marks,Grade\n");
            for (String id : map1.keySet()) {
                if (map2.containsKey(id)) {
                    String[] data1 = map1.get(id);
                    String[] data2 = map2.get(id);
                    writer.write(id + "," + data1[0] + "," + data1[1] + "," + data2[0] + "," + data2[1] + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
