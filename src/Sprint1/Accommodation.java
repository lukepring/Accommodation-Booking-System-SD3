package Sprint1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Accommodation {
    private int accommodationID;
    private String title;
    private String location;
    private BigDecimal pricePerNight;
    private int capacity;
    private List<Booking> bookings = new ArrayList<>();
    private List<Facility> facilities = new ArrayList<>();

    protected Accommodation(int accommodationID, String title, String location, BigDecimal pricePerNight, int capacity) {
        this.accommodationID = accommodationID;
        this.title = title;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
    }

    public void addFacility(Facility facility) {
        facilities.add(facility);
    }

    public boolean isAvailable(LocalDate startDate, LocalDate endDate) {
        for (Booking b : bookings) {
            if (b.getStartDate() == null || b.getEndDate() == null) continue;
            boolean overlaps = !endDate.isBefore(b.getStartDate()) && !startDate.isAfter(b.getEndDate());
            if (overlaps) return false;
        }
        return true;
    }

    public abstract void printDetails();

    // Basic protected getters for subclasses
    protected int getAccommodationID() { return accommodationID; }
    protected String getTitle() { return title; }
    protected String getLocation() { return location; }
    protected BigDecimal getPricePerNight() { return pricePerNight; }
    protected int getCapacity() { return capacity; }
    protected List<Facility> getFacilities() { return facilities; }
    protected List<Booking> getBookings() { return bookings; }
}
