package ap.livecodes.y404.m1.d19;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int size=10;
        MyMatrix myMatrix = new MyMatrix(size,"Alireza");

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
