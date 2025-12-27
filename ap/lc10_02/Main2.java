package ap.lc10_02;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

//        ArrayManager arrayManager = new ArrayManager(100);
//        ArrayListManager arrayManager = new ArrayListManager(10);

        ParentArrayManager arrayManager = new ArrayManager(10);
//        ParentArrayManager arrayManager = new ArrayListManager(10);
//        ParentArrayManager arrayManager = new ParentArrayManager();

        //call parent method
        arrayManager.printCreateDate();

        //call child method
        System.out.println(arrayManager.toString());
        System.out.println(arrayManager);
        arrayManager.print();

        arrayManager.printMinWithIndex();

        arrayManager.printMaxWithIndex();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index1: ");
        int index1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter index2: ");
        int index2 = Integer.parseInt(scanner.nextLine());

        arrayManager.changeTwoIndexValues(index1, index2);

        arrayManager.print();
        System.out.println(arrayManager.toString());
        System.out.println(arrayManager);


    }
}
