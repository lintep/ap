package ap.livecodes.y404m1d19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int size=10;
        int[][] matrix = new int[size][size];

        fillRandom(matrix);

        printMatrix(matrix);

        String fileName="matrix.txt";
        writeToFile(matrix,fileName);

        int sizeInFile=size;
        int[][] matrixLoadFromFile=loadFromFile(fileName,sizeInFile);
        System.out.println("_____________________");

        printMatrix(matrixLoadFromFile);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }


    private static void fillRandom(int[][] matrix) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=random.nextInt(100);
            }
        }
    }

    private static void writeToFile(int[][] matrix, String fileName) throws FileNotFoundException {
        PrintWriter matrixPrintWriter = new PrintWriter(fileName);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixPrintWriter.print(matrix[i][j]+"\t");
            }
            matrixPrintWriter.println();
        }
        matrixPrintWriter.close();
    }


    private static int[][] loadFromFile(String fileName, int sizeInFile) throws FileNotFoundException {
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
        return matrixLoadFromFile;
    }
}
