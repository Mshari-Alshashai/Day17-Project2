public class NonSubscribersPassengers extends Passenger{

    private boolean discountCoupon;

    public NonSubscribersPassengers(String name, String ID, Car car, boolean discountCoupon) {
        super(name, ID, car);
        this.discountCoupon=discountCoupon;
    }

    @Override
    public double tripCost(Car car) {
        try {
            if (car.getMaxPassengers() == 0) throw new RuntimeException();
            setCar(car);
            car.setMaxPassengers(car.getMaxPassengers()-1);
            if (discountCoupon) setTripCost(car.getFixedRoute().getTripPrice() - car.getFixedRoute().getTripPrice() * 0.1);
            else setTripCost(car.getFixedRoute().getTripPrice());
            return getTripCost();
        } catch (RuntimeException e) {
            System.out.println("There is no seat available");
            return 0;
        }
    }

    @Override
    public String toString() {
        if (getTripCost()==0)return "There is no reservation";
        return super.toString()+"\nDiscount Coupon: "+discountCoupon;
    }
}
