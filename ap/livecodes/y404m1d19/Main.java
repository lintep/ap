package ap.livecodes.y404m1d19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();

        int size=10;
        int[][] matrix = new int[size][size];

        //fill random
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j]=random.nextInt(100);
            }
        }

        //print
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        String fileName="matrix.txt";
        //write to file
        PrintWriter matrixPrintWriter = new PrintWriter(fileName);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixPrintWriter.print(matrix[i][j]+"\t");
            }
            matrixPrintWriter.println();
        }
        matrixPrintWriter.close();


        int sizeInFile=size;
        int[][] matrixLoadFromFile = new int[sizeInFile][sizeInFile];

        Scanner scanner = new Scanner(new File(fileName));
        int i = 0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] split = line.split("\t");
            for (int j = 0; j < sizeInFile; j++) {
                matrixLoadFromFile[i][j] = Integer.parseInt(split[j]);
            }
            i++;
        }
        scanner.close();

        System.out.println("_____________________");

        //print
        for (i = 0; i < sizeInFile; i++) {
            for (int j = 0; j < sizeInFile; j++) {
                System.out.print(matrixLoadFromFile[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
