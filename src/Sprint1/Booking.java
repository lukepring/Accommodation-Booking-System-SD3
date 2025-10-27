package Sprint1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Booking {
    public int bookingID;
    User user;
    Accommodation accommodation;
    LocalDate startDate;
    LocalDate endDate;
    BigDecimal totalPrice;

    public Booking(int bookingID, User user, Accommodation accommodation, LocalDate startDate, LocalDate endDate, BigDecimal totalPrice) {
        this.bookingID = bookingID;
        this.user = user;
        this.accommodation = accommodation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
