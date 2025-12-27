package ap.lc10_02;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        part1
//        int[] array = {1,3,2,65,9};

        Random random = new Random();
        int[] array=new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(1000);
        }


//        part2
        int minIndex=0;
        int minValue = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if(array[i]<minValue){
                minIndex=i;
                minValue=array[minIndex];
            }
        }

        System.out.println("minIndex: "+minIndex+ "\tminValue: "+minValue);

//        part3
        int maxIndex=0;
        int maxValue = array[maxIndex];

        for (int i = 1; i < array.length; i++) {
            if(array[i]>maxValue){
                maxIndex=i;
                maxValue=array[maxIndex];
            }
        }

        System.out.println("maxIndex: "+maxIndex+ "\tmaxValue: "+maxValue);

//        part4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index1: ");
        int index1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter index2: ");
        int index2 = Integer.parseInt(scanner.nextLine());
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;

//        part5
        for (int value : array) {
            System.out.println(value);
        }
    }
}
