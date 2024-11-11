import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Route route1=new Route("Dammam","Riyadh",250);
        Route route2=new Route("Jubail","Khobar",100);

        Car car1=new Car("F35",route1,1);
        Car car2=new Car("F15",route2,2);
        Car car3=new Car("F16",route2,3);
        Car car4=new Car("F36",route1,0);

        ArrayList<Passenger> passengers = new ArrayList<>();

        passengers.add(new SubscribersPassengers("Waleed","1112223334",car1));
        passengers.add(new NonSubscribersPassengers("Mohammed","1103334445",car3,true));
        passengers.add(new NonSubscribersPassengers("Ahmed","1012291003",car2,false));
        passengers.add(new NonSubscribersPassengers("Abdullah","1101150445",car1,false));
        passengers.add(new SubscribersPassengers("Nasser","1019150335",car4));

        for (Passenger p : passengers){
            p.tripCost(p.getCar());
            System.out.println(p.toString());
            System.out.println("======================================================");
        }


    }
}