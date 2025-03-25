import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

        int youngestAge = ageAmar;
        String youngestFriend = "Amar";
        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }

        double tallestHeight = heightAmar;
        String tallestFriend = "Amar";
        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

        System.out.println(youngestFriend + " is the youngest with " + youngestAge + " years.");
        System.out.println(tallestFriend + " is the tallest with " + tallestHeight + " cm.");

        sc.close();
    }
    
}
