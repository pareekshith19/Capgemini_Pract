import java.io.*;

public class Problem3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_info.txt")) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + "\nAge: " + age + "\nFavorite Language: " + language);
            System.out.println("Information saved to user_info.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
