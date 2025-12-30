package ap.lc10_09;

import ap.lc10_07.Passenger;
import ap.lc10_07.PassengerArrayManager;

public class Main1 {

    public static void main(String[] args) {
        PassengerMapManager passengerMapManager = new PassengerMapManager();
        passengerMapManager.printMinAgeWithIndex();

        Passenger passenger = new Passenger(432545427,"ali","ahmadi",23);
        boolean addResult1 = passengerMapManager.add(5, passenger);
        if(!addResult1)
            System.out.println("Add1 failed.");

        boolean addResult2 = passengerMapManager.add(5, new Passenger(123,"mahrokh","navazi",32));
        if(!addResult2)
            System.out.println("Add2 failed.");

        passengerMapManager.printMinAgeWithIndex();

        passengerMapManager.add(0, passenger);

        System.out.println(passengerMapManager);

        System.out.println("passenger index: "+passengerMapManager.getChairIndex(passenger.getId()));
    }
}
