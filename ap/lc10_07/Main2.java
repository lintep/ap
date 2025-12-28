package ap.lc10_07;

public class Main2 {

    public static void main(String[] args) {
        PassengerArrayManager passengerArrayManager = new PassengerArrayManager();
        passengerArrayManager.printMinAgeWithIndex();

        Passenger passenger = new Passenger(432545427,"ali","ahmadi",23);
        boolean addResult1 = passengerArrayManager.add(5, passenger);
        if(!addResult1)
            System.out.println("Add1 failed.");

        boolean addResult2 = passengerArrayManager.add(5, new Passenger(123,"mahrokh","navazi",32));
        if(!addResult2)
            System.out.println("Add2 failed.");

        passengerArrayManager.printMinAgeWithIndex();

        passengerArrayManager.add(0, passenger);

        System.out.println(passengerArrayManager);
    }
}
