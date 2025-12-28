package ap.lc10_07;

public class Main1 {

    public static void main(String[] args) {
        Passenger passenger = new Passenger(432545427,"ali","ahmadi",23);
        if (passenger.getAge()<50)
            System.out.println(passenger);


        Passenger[] passengers = new Passenger[22];
        passengers[0]=passenger;
        if (passengers[0].getAge()<50)
            System.out.println(passengers[0]);
    }
}
