package Sprint1;

public class Facility {
    private int facilityID;
    private String name;

    public Facility(int facilityID, String name) {
        this.facilityID = facilityID;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Facility Id: " + facilityID + ", Name: " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
