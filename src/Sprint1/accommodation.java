package Sprint1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class accommodation {

    private int accommodationId;
    private String title;
    private String location;
    private BigDecimal pricePerNight;
    private int capacity;
    private List<Booking> bookings;
    private List<Facility> facilities;

    public accommodation(int accommodationId, String title, String location, BigDecimal pricePerNight, int capacity) {
        this.accommodationId = accommodationId;
        this.title = title;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
    }
    
    public void addFacility(Facility facility) {
        facilities.add(facility);
    }
    
    public void removeFacility(int facilityId) {
        facilities.remove(facilityId);
    }
    
    // isAvailable class TBC
    
    public void printDetails() {
        System.out.println("Accommodation Id: " + accommodationId);
        System.out.println("Title: " + title);
        System.out.println("Location: " + location);
        System.out.println("PricePerNight: " + pricePerNight);
        System.out.println("Capacity: " + capacity);
        System.out.println("Facilities: ");
        for (Facility facility : facilities) {
            System.out.println("- " + facility);
        }
        System.out.println("Bookings: ");
        for (Booking booking : bookings) {
            System.out.println("- " + booking);
        }
    }

}
