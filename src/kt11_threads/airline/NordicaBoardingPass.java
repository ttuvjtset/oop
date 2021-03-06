package kt11_threads.airline;

public class NordicaBoardingPass implements BoardingPass {

    private String firstName;
    private String lastName;
    private long ticketCode;
    private int gateID;

    NordicaBoardingPass(String firstName, String lastName,
                        long ticketCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketCode = ticketCode;
    }

    public int getGateID() {
        return gateID;
    }

    @Override
    public String getPassengerFirstName() {
        return firstName;
    }

    @Override
    public String getPassengerLastName() {
        return lastName;
    }

    @Override
    public long getTicketCode() {
        return ticketCode;
    }

    @Override
    public void setProcessedByGateID(int gateID) {
        this.gateID = gateID;
    }

    @Override
    public String toString() {
        return "NordicaBoardingPass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ticketCode=" + ticketCode +
                ", gateID=" + gateID +
                '}';
    }
}
