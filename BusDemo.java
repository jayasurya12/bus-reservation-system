package busRevSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        // Create a list of buses
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1234, true, 450));
        buses.add(new Bus(1432, true, 150));
        buses.add(new Bus(1283, true, 350));

        // Display bus information
        for (Bus bus : buses) {
            bus.displayBusInfo();
        }

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int userOpt = 1;
        while(userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to exit");
            userOpt = scanner.nextInt();
            if (userOpt == 1) {
                Booking booking = new Booking();
                if (bookings.add(booking)) {
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry. Bus is full. Try another bus or date.");
                }
            }
        }

        scanner.close();
    }
}


