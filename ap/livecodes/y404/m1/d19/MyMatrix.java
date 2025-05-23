package ap.livecodes.y404.m1.d19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class MyMatrix {
    private int[][] matrix;
    private String appName;

    public MyMatrix(int size, String appName) {
        matrix = new int[size][size];
        this.appName=appName;
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void fillRandom() {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=random.nextInt(100);
            }
        }
    }

    public void writeToFile(String fileName) throws FileNotFoundException {
        PrintWriter matrixPrintWriter = new PrintWriter(fileName);
        matrixPrintWriter.println(appName);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixPrintWriter.print(matrix[i][j]+"\t");
            }
            matrixPrintWriter.println();
        }
        matrixPrintWriter.close();
    }

    public void loadFromFile(String fileName, int sizeInFile) throws FileNotFoundException {
        int[][] matrixLoadFromFile = new int[sizeInFile][sizeInFile];

        Scanner scanner = new Scanner(new File(fileName));
        int i = 0;
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            if (i==0){
                this.appName=line;
            }
            else {
                String[] split = line.split("\t");
                for (int j = 0; j < sizeInFile; j++) {
                    matrixLoadFromFile[i][j] = Integer.parseInt(split[j]);
                }
            }
            i++;
        }
        scanner.close();

        matrix=matrixLoadFromFile;
    }
}
