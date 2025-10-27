package Sprint1;

import java.math.BigDecimal;

public class Flat extends Accommodation {
    private int numberOfBedrooms;

    public Flat(int accommodationID, String title, String location, BigDecimal pricePerNight, int capacity, int numberOfBedrooms) {
        super(accommodationID, title, location, pricePerNight, capacity);
        this.numberOfBedrooms = numberOfBedrooms;
    }

    @Override
    public void printDetails() {
        System.out.print("Flat: ID=" + getAccommodationID() + ", Title=" + getTitle() + ", Location=" + getLocation() +
                ", PricePerNight=" + getPricePerNight() + ", Capacity=" + getCapacity() + ", Bedrooms=" + numberOfBedrooms);
        // Append facilities inline
        if (getFacilities() == null || getFacilities().isEmpty()) {
            System.out.println(" | Facilities: None");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < getFacilities().size(); i++) {
                sb.append(getFacilities().get(i));
                if (i < getFacilities().size() - 1) sb.append(", ");
            }
            System.out.println(" | Facilities: " + sb);
        }
    }
}
