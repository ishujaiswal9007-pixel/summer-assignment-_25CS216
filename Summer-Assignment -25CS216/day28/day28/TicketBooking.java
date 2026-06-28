import java.util.*;

public class TicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = 5;

        System.out.println("Available Seats = " + seats);

        System.out.print("Enter number of tickets: ");
        int ticket = sc.nextInt();

        if (ticket <= seats) {
            seats -= ticket;
            System.out.println("Booking Successful");
            System.out.println("Remaining Seats = " + seats);
        } else {
            System.out.println("Seats Not Available");
        }
    }
}
