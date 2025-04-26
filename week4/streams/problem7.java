import java.io.*;

public class Problem7 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student_data.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("John Doe");
            dos.writeDouble(3.75);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("student_data.dat"))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Student Data - Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
