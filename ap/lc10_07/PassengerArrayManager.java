package ap.lc10_07;

import ap.lc10_02.ParentArrayManager;

import java.util.Arrays;
import java.util.Random;

public class PassengerArrayManager{

    private Passenger[] array;

    public PassengerArrayManager(int size){
        this.array=new Passenger[size];
    }

    public PassengerArrayManager(){
        this(22);
    }

    public void printMinAgeWithIndex(){
        int minIndex=-1;
        int minValue = -1;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i]!=null) {
                minIndex=i;
                minValue = this.array[minIndex].getAge();
                break;
            }
        }

        for (int i = minIndex+1; i < this.array.length; i++) {
            if(this.array[i]!=null) {
                if (this.array[i].getAge() < minValue) {
                    minIndex = i;
                    minValue = this.array[minIndex].getAge();
                }
            }
        }

        if(minIndex>=0)
            System.out.println("minAgeIndex: "+minIndex+ "\tminAgeValue: "+minValue);
        else
            System.out.println("[printMinAgeWithIndex] No passenger");
    }

    public void printMaxAgeWithIndex(){
        int maxIndex=0;
        int maxValue = array[maxIndex].getAge();

        for (int i = 1; i < array.length; i++) {
//            Passenger passengerObject = array[i];
//            if(passengerObject.getAge()>maxValue){
            if(array[i].getAge()>maxValue){
                maxIndex=i;
                maxValue=array[maxIndex].getAge();
            }
        }

        System.out.println("maxIndex: "+maxIndex+ "\tmaxValue: "+maxValue);
    }


    public void changeTwoIndexPassengers(int index1, int index2){
        Passenger temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }


    public void print() {
        for (Passenger passenger : array) {
//            passenger.print();
//            System.out.println(passenger.toString());
            System.out.println(passenger);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ArrayManager{" +
                "array=" + Arrays.toString(array) +
                "size="+array.length +
                '}';
    }

    public boolean add(int index, Passenger passenger) {
        if (!isExist(passenger))
            if (this.array[index] == null) {
                this.array[index] = passenger;
                return true;
            }
            else
                System.out.println("index "+index+ " is filled.");
        else
            System.out.println(passenger+" is exist");

        return false;
    }

    private boolean isExist(Passenger passenger) {
        for (int i = 0; i < this.array.length; i++) {
            if(array[i]!=null && array[i].getId() == passenger.getId())
                return true;
        }
        return false;
    }
}
