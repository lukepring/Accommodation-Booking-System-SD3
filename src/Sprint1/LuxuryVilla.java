package Sprint1;

import java.math.BigDecimal;

public class LuxuryVilla extends Accommodation {
    private double squareFootage;

    public LuxuryVilla(int accommodationID, String title, String location, BigDecimal pricePerNight, int capacity, double squareFootage) {
        super(accommodationID, title, location, pricePerNight, capacity);
        this.squareFootage = squareFootage;
    }

    @Override
    public void printDetails() {
        System.out.print("LuxuryVilla: ID=" + getAccommodationID() + ", Title=" + getTitle() + ", Location=" + getLocation() +
                ", PricePerNight=" + getPricePerNight() + ", Capacity=" + getCapacity() + ", SquareFootage=" + squareFootage);
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
