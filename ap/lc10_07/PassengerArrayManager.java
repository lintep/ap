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
        int minIndex=0;
        int minValue = this.array[minIndex].getAge();

        for (int i = 1; i < this.array.length; i++) {
            if(this.array[i].getAge()<minValue){
                minIndex=i;
                minValue=this.array[minIndex].getAge();
            }
        }

        System.out.println("minAgeIndex: "+minIndex+ "\tminAgeValue: "+minValue);
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
}
