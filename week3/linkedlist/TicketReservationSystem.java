class TicketReservationSystem {
    static class Ticket {
        String passengerName;
        int ticketId;
        String destination;
        Ticket next;

        Ticket(String passengerName, int ticketId, String destination) {
            this.passengerName = passengerName;
            this.ticketId = ticketId;
            this.destination = destination;
        }
    }

    Ticket last = null;

    void bookTicket(String name, int id, String dest) {
        Ticket newTicket = new Ticket(name, id, dest);
        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        System.out.println("Ticket booked for: " + name);
    }

    void cancelTicket(int id) {
        if (last == null) return;

        Ticket curr = last.next, prev = last;
        do {
            if (curr.ticketId == id) {
                if (curr == last && curr == last.next) {
                    last = null; // only one ticket
                } else {
                    prev.next = curr.next;
                    if (curr == last) last = prev;
                }
                System.out.println("Cancelled ticket ID: " + id);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != last.next);

        System.out.println("Ticket ID " + id + " not found.");
    }

    void viewAllTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket temp = last.next;
        System.out.println("\nAll Booked Tickets:");
        do {
            System.out.println("Passenger: " + temp.passengerName + " | Ticket ID: " + temp.ticketId + " | Destination: " + temp.destination);
            temp = temp.next;
        } while (temp != last.next);
    }

    void countTickets() {
        if (last == null) {
            System.out.println("Total tickets: 0");
            return;
        }
        int count = 0;
        Ticket temp = last.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("Total tickets: " + count);
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        trs.bookTicket("John", 301, "Delhi");
        trs.bookTicket("Emma", 302, "Mumbai");
        trs.bookTicket("Liam", 303, "Chennai");
        trs.viewAllTickets();
        trs.countTickets();
        trs.cancelTicket(302);
        trs.viewAllTickets();
        trs.countTickets();
    }
}
