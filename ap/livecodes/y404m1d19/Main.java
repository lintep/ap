package ap.livecodes.y404m1d19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int size=10;
        MyMatrix myMatrix = new MyMatrix(size);

        myMatrix.fillRandom();

        myMatrix.printMatrix();

        String fileName="matrix.txt";
        myMatrix.writeToFile(fileName);

        int sizeInFile=size;
        myMatrix.loadFromFile(fileName,sizeInFile);
        System.out.println("_____________________");

        myMatrix.printMatrix();
    }

}
