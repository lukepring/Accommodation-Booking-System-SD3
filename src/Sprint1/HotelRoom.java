package Sprint1;

import java.math.BigDecimal;

public class HotelRoom extends Accommodation {
    private String roomNumber;

    public HotelRoom(int accommodationID, String title, String location, BigDecimal pricePerNight, int capacity, String roomNumber) {
        super(accommodationID, title, location, pricePerNight, capacity);
        this.roomNumber = roomNumber;
    }

    @Override
    public void printDetails() {
        System.out.print("HotelRoom: ID=" + getAccommodationID() + ", Title=" + getTitle() + ", Location=" + getLocation() +
                ", PricePerNight=" + getPricePerNight() + ", Capacity=" + getCapacity() + ", RoomNumber=" + roomNumber);
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
