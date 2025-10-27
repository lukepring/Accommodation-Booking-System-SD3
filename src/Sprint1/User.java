package Sprint1;

import java.util.ArrayList;
import java.util.List;

public class User {
    public int userID;
    private String name;
    private String email;
    private List<Booking> bookings = new ArrayList<>();

    public User(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public void printDetails() {
        System.out.println("User Id: " + userID + ", Name: " + name + ", Email: " + email);
    }
}
