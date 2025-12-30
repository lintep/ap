package ap.lc10_09;

import ap.lc10_07.Passenger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PassengerMapManager {

    private HashMap<Integer,Passenger> passengerIdToPassengerMap;
    private HashMap<Integer,Integer> passengersIdToChairIndexMap;// passengerId to chairIndex
    private HashMap<Integer,Integer> chairIndexToPassengerIdMap;
    private int size;


    public PassengerMapManager(int size){
        passengerIdToPassengerMap=new HashMap<>();
        passengersIdToChairIndexMap=new HashMap<>();
        chairIndexToPassengerIdMap =new HashMap<>();
        this.size=size;
    }

    public PassengerMapManager(){
        this(22);
    }

    public void printMinAgeWithIndex(){
        int minIndex=-1;
        int minValue = 1000000;
//        this.passengerIdToPassengerMap.values().iterator();
        for (Passenger passenger : this.passengerIdToPassengerMap.values()) {
            if(passenger.getAge() < minValue) {
                minIndex = this.passengersIdToChairIndexMap.get(passenger.getId());
                minValue = passenger.getAge();
            }
        }

        if(minIndex>=0)
            System.out.println("minAgeIndex: "+minIndex+ "\tminAgeValue: "+minValue);
        else
            System.out.println("[printMinAgeWithIndex] No passenger");
    }

    public void printMaxAgeWithIndex(){
        int maxIndex=-1;
        int maxValue = -1;

        for (Passenger passenger : this.passengerIdToPassengerMap.values()) {
            if(passenger.getAge() < maxValue) {
                maxIndex = this.passengersIdToChairIndexMap.get(passenger.getId());
                maxValue = passenger.getAge();
            }
        }

        System.out.println("maxIndex: "+maxIndex+ "\tmaxValue: "+maxValue);
    }


    public void changeTwoIndexPassengers(int index1, int index2){
        int passengerId1 = this.chairIndexToPassengerIdMap.get(index1);
        int passengerId2 = this.chairIndexToPassengerIdMap.get(index2);

        this.chairIndexToPassengerIdMap.put(index1,passengerId2);
        this.chairIndexToPassengerIdMap.put(index2,passengerId1);

        this.passengersIdToChairIndexMap.put(passengerId1,index2);
        this.passengersIdToChairIndexMap.put(passengerId2,index1);
    }


    public void print() {
        for (Passenger passenger : this.passengerIdToPassengerMap.values()) {
            System.out.println(passenger);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        List<String> passengerInformationList=new ArrayList<>();
        for (Passenger passenger : this.passengerIdToPassengerMap.values()) {
            passengerInformationList.add(passenger.toString());
        }
        return "ArrayManager{" +
                "array=" + Arrays.toString(passengerInformationList.toArray()) +
                "size="+this.passengerIdToPassengerMap.size() +
                '}';
    }

    public boolean add(int chairIndex, Passenger passenger) {
        if (!this.passengerIdToPassengerMap.containsKey(passenger.getId()))
            if (!this.chairIndexToPassengerIdMap.containsKey(chairIndex)) {
                this.passengerIdToPassengerMap.put(passenger.getId(),passenger);
                this.chairIndexToPassengerIdMap.put(chairIndex,passenger.getId());
                this.passengersIdToChairIndexMap.put(passenger.getId(),chairIndex);
                return true;
            }
            else
                System.out.println("index "+chairIndex+ " is filled.");
        else
            System.out.println(passenger+" is exist");

        return false;
    }


    public int getChairIndex(int passengerId) {
        if(passengersIdToChairIndexMap.containsKey(passengerId))
            return this.passengersIdToChairIndexMap.get(passengerId);
        return -1;
    }
}
