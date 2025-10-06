import java.util.Arrays;
// 11.Building a Flight Booking System (Array-based Simulation) 
// Problem: You are tasked with building a basic flight booking system. Each flight can have a 
// set number of seats, and passengers can book seats on a flight. If all seats are filled, passengers 
// should be notified that no seats are available. Create an array to represent the flight's seating 
// and implement the booking functionality.

class FlightBooking {
    private boolean[] seats; // true if the seat is booked, false if not
    private int totalSeats;

    public FlightBooking(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats]; // All seats initialized to false (unbooked)
        Arrays.fill(this.seats, false);
    }

    public boolean bookSeat(int seatNumber) {
        
        if (seatNumber < 0 || seatNumber >= totalSeats) {
            System.out.println("Invalid seat number!");
            return false;
        }

        if (seats[seatNumber]) {
            System.out.println("Seat " + seatNumber + " is already booked!");
            return false;
        }
         else {
            seats[seatNumber] = true;
            System.out.println("Seat " + seatNumber + " successfully booked!");
            return true;
        }
    }

    public void displaySeats() {
        System.out.print("Flight Seating: ");
        for (boolean seat : seats) {
            System.out.print(seat ? "B " : "A "); // "B" for booked, "A" for available
        }
        System.out.println();
    }

    public void checkAvailability() {
        int availableSeats = 0;
        for (boolean seat : seats) {
            if (!seat) availableSeats++;
        }
        if (availableSeats == 0) {
            System.out.println("No seats available!");
        } else {
            System.out.println("Seats available: " + availableSeats);
        }
    }

    public static void main(String[] args) {
        FlightBooking flight = new FlightBooking(10); // Flight with 10 seats

        flight.bookSeat(1);  // Book seat 5
        flight.bookSeat(5);  // Attempt to book seat 5 again
        flight.displaySeats();  // Display seat availability
        flight.checkAvailability();  // Check available seats
    }
}
