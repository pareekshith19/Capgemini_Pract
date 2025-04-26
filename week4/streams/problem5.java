import java.io.*;

public class Problem5 {
    public static void main(String[] args) {
        String inputImage = "input.jpg";
        String outputImage = "output.jpg";

        try (ByteArrayInputStream bais = new ByteArrayInputStream(readFile(inputImage));
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            int byteRead;
            while ((byteRead = bais.read()) != -1) {
                baos.write(byteRead);
            }

            writeFile(outputImage, baos.toByteArray());
            System.out.println("Image has been successfully copied.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFile(String filePath) throws IOException {
        File file = new File(filePath);
        byte[] fileContent = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(fileContent);
        }
        return fileContent;
    }

    private static void writeFile(String filePath, byte[] data) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(data);
        }
    }
}
