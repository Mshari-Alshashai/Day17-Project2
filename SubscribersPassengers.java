public class SubscribersPassengers extends Passenger{

    public SubscribersPassengers(String name, String ID, Car car) {
        super(name, ID, car);
    }

    @Override
    public double tripCost(Car car) {
        try {
            if (car.getMaxPassengers()==0)throw new RuntimeException();
            setCar(car);
            car.setMaxPassengers(car.getMaxPassengers()-1);
            setTripCost(car.getFixedRoute().getTripPrice()*0.5);
            return getTripCost();
        } catch (RuntimeException e) {
            System.out.println("There is no seat available");
            return 0;
        }

    }

    @Override
    public String toString() {
        if (getTripCost()==0) return "There is no reservation";
        return super.toString();
    }
}
