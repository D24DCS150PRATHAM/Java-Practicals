package part3;

public class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean isDelayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = false;
    }

    public String checkFlightStatus() {
        return isDelayed ? "Delayed" : "On Time";
    }

    public void delayFlight() {
        this.isDelayed = true;
    }

    public void displayFlightInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Status: " + checkFlightStatus());
    }

    public static void main(String[] args) {
        Airplane flight1 = new Airplane("AI123", "New York", "10:00 AM");
        flight1.displayFlightInfo();
        
        flight1.delayFlight();

        System.out.println("\nAfter delay:");
        flight1.displayFlightInfo();
    }
}

