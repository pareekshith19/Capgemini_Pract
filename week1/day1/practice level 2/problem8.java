import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter traveler's name: ");
        String name = input.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter to city: ");
        String toCity = input.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (km): ");
        double distanceFromToVia = input.nextDouble();
        input.nextLine();
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = input.nextInt();
        input.nextLine();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (km): ");
        double distanceViaToFinalCity = input.nextDouble();
        input.nextLine();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = input.nextInt();
        input.nextLine();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");
        input.close();
    }
    
}
