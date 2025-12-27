package ap.lc10_02;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        ArrayManager arrayManager = new ArrayManager(100);

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
