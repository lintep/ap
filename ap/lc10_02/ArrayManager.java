package ap.lc10_02;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager extends ParentArrayManager{

    //    private int[] array=new int[size];
    private int[] array;

//    public ArrayManager(){
//        init();
//    }
//
////    part1
//    private void init(){
//        Random random = new Random();
//        this.array=new int[5];
//        for (int i = 0; i < this.array.length; i++) {
//            this.array[i]=random.nextInt(1000);
//        }
//    }

    //    part1
    public ArrayManager(int size){
        Random random = new Random();
        this.array=new int[size];
        for (int i = 0; i < this.array.length; i++) {
            this.array[i]=random.nextInt(1000);
        }
    }

    //    part2
    @Override
    public void printMinWithIndex(){
        int minIndex=0;
        int minValue = this.array[minIndex];

        for (int i = 1; i < this.array.length; i++) {
            if(this.array[i]<minValue){
                minIndex=i;
                minValue=this.array[minIndex];
            }
        }

        System.out.println("minIndex: "+minIndex+ "\tminValue: "+minValue);
    }

    //    part3
    @Override
    public void printMaxWithIndex(){
        int maxIndex=0;
        int maxValue = array[maxIndex];

        for (int i = 1; i < array.length; i++) {
            if(array[i]>maxValue){
                maxIndex=i;
                maxValue=array[maxIndex];
            }
        }

        System.out.println("maxIndex: "+maxIndex+ "\tmaxValue: "+maxValue);
    }

    @Override
    public void changeTwoIndexValues(int index1, int index2){

        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    @Override
    public void print() {
        for (int value : array) {
            System.out.print(value+" ,");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ArrayManager{" +
                "array=" + Arrays.toString(array) +
                "size="+array.length +
                '}';
//        return this.array.toString();
    }
}
