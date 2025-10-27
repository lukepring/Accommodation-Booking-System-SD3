package Sprint1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Sample Users
        User user1 = new User(1, "Alice Smith", "alice@example.com");
        User user2 = new User(2, "Bob Jones", "bob@example.com");

        // Sample Accommodations
        Flat flat = new Flat(101, "City Center Flat", "Dublin", new BigDecimal("120.00"), 4, 2);
        LuxuryVilla villa = new LuxuryVilla(202, "Seaside Villa", "Galway", new BigDecimal("350.00"), 6, 2500.0);

        // Print accommodations before facilities are added

        System.out.println("\n-- Accommodations --");
        flat.printDetails();
        villa.printDetails();

        // Sample Facilities
        Facility wifi = new Facility(1, "Wi-Fi");
        Facility parking = new Facility(2, "Parking");

        // Add facilities to accommodations using addFacility
        flat.addFacility(wifi);
        flat.addFacility(parking);
        villa.addFacility(wifi);
        villa.addFacility(parking);

        // Print accommodations after facilities are added
        System.out.println("\n-- Accommodations (after adding facilities) --");
        flat.printDetails();
        villa.printDetails();

        // Sample Bookings
        Booking booking1 = new Booking(1, user1, flat,
                LocalDate.of(2025, 11, 1), LocalDate.of(2025, 11, 5), new BigDecimal("480.00"));
        Booking booking2 = new Booking(2, user2, villa,
                LocalDate.of(2025, 12, 20), LocalDate.of(2025, 12, 27), new BigDecimal("2450.00"));

        // Print details using printDetails methods
        System.out.println("\n-- Users --");
        user1.printDetails();
        user2.printDetails();

        System.out.println("\n-- Facilities --");
        wifi.printDetails();
        parking.printDetails();

        System.out.println("\n-- Bookings --");
        System.out.println(booking1);
        System.out.println(booking2);
    }
}