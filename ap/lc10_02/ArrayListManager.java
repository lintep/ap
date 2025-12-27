package ap.lc10_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListManager implements ParentArrayManagerInterface{

    private ArrayList<Integer> list;


    //    part1
    public ArrayListManager(int size){
        Random random = new Random();
        this.list =new ArrayList<>();
        for (int i = 0; i < size; i++) {
            this.list.add(random.nextInt(1000));
        }
    }

    //    part2
    @Override
    public void printMinWithIndex(){
        int minIndex=0;
        int minValue = this.list.get(minIndex);

        for (int i = 1; i < this.list.size(); i++) {
            if(this.list.get(i)<minValue){
                minIndex=i;
                minValue=this.list.get(minIndex);
            }
        }

        System.out.println("minIndex: "+minIndex+ "\tminValue: "+minValue);
    }

    //    part3
    @Override
    public void printMaxWithIndex(){
        int maxIndex=0;
        int maxValue = list.get(maxIndex);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)>maxValue){
                maxIndex=i;
                maxValue= list.get(maxIndex);
            }
        }

        System.out.println("maxIndex: "+maxIndex+ "\tmaxValue: "+maxValue);
    }

    @Override
    public void changeTwoIndexValues(int index1, int index2){

        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp);
    }

    @Override
    public void print() {
        for (int value : list) {
            System.out.print(value+" ,");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ArrayListManager{" +
                "list=" + list.toString() +
                '}';
    }

//    @Override
//    public void printCreateDate() {
//        System.out.println("called from child "+this.getClass().getName());
//        super.printCreateDate();
//    }
}
