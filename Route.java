public class Route {
    private String startAddress;
    private String destination;
    private double tripPrice;

    public Route(String startAddress, String destination, double tripPrice) {
        this.startAddress = startAddress;
        this.destination = destination;
        this.tripPrice = tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
       if (tripPrice>=0)this.tripPrice = tripPrice;
    }
}
