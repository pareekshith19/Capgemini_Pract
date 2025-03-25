import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        scanner.close();
    }

    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestName = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestName = names[i];
            }
        }
        return youngestName;
    }

    public static String findTallest(double[] heights, String[] names) {
        double tallestHeight = heights[0];
        String tallestName = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestName = names[i];
            }
        }
        return tallestName;
    }
}