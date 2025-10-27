package Sprint1;

public class Sofa extends Facility {
    private boolean hostIsPresent;

    public Sofa(int facilityID, String name, boolean hostIsPresent) {
        super(facilityID, name);
        this.hostIsPresent = hostIsPresent;
    }

    @Override
    public void printDetails() {
        System.out.println("Sofa: hostIsPresent=" + hostIsPresent);
    }
}
