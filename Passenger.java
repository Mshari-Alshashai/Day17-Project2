public abstract class Passenger {

    private String name;
    private String ID;
    private Car car;
    private double tripCost;

    public Passenger(String name, String ID, Car car) {
        this.name = name;
        this.ID = ID;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract double tripCost(Car car);

    @Override
    public String toString() {
        return ("Name: "+name+"\nID: "+ID+"\nCar: "+car.getCode()+"\nFrom: "+car.getFixedRoute().getStartAddress()+"\nTo: "+car.getFixedRoute().getDestination()+"\nRout Price: "+tripCost);
    }
}
