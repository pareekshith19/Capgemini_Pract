class problem4 {
    String movieName;
    String seatNumber;
    double price;

    public problem4(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for seat: " + seatNumber);
    }

    public void displayTicketDetails() {
        if (seatNumber != null) {

            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Price: ₹" + price);

        } else {
            System.out.println("No ticket booked yet for " + movieName + ".");
        }
    }

    public static void main(String[] args) {
        problem4 ticket1 = new problem4("Avengers: Endgame");
        problem4 ticket2 = new problem4("Oppenheimer");

        ticket1.bookTicket("A10", 250.00);
        ticket1.displayTicketDetails();

        ticket2.displayTicketDetails();
        ticket2.bookTicket("B5", 300.00);
        ticket2.displayTicketDetails();
    }
}