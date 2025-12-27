package ap.lc08_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sudoku {

    private String fileAddress;
    private int[][] matrix;
    private int startTime;
    private int fillCount;
    private int removeCount;


    public Sudoku(String fileAddress) throws FileNotFoundException {

        this.fileAddress=fileAddress;
        this.fillCount=0;
        this.removeCount=0;
        this.startTime = (int)(System.currentTimeMillis()/1000);
        this.matrix=new int[9][9];
        this.loadMatrixFromFile();

    }

    private void loadMatrixFromFile() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(this.fileAddress));
        int i=0;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] split = line.split(",");
            for (int j = 0; j < 9; j++) {
                if (j >= split.length) {
                    matrix[i][j] = 0;
                    continue;
                }
                String s = split[j];
                int value =0;
                if(s.length()==1)
                    value = Integer.parseInt(s);
                matrix[i][j]=value;
            }
            i++;
        }
        scanner.close();
    }

    public void print(){

        System.out.println("\n===============================\n");

        for (int i = 0; i < 9; i++) {
            if(i%3==0)
                System.out.println("__________________");
            for (int j = 0; j < 9; j++) {
                if(j%3==0)
                    System.out.print("|\t");
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public void fill(int value, int i, int j) throws FileNotFoundException {

        if(checkRules(i,j,value)){
            this.matrix[i][j]=value;
            this.fillCount++;
            this.saveToFile();
        }

    }

    public void remove(int i, int j){
        this.matrix[i][j]=0;
        this.removeCount++;
    }

    private boolean checkRules(int inputI, int inputJ, int inputValue) {

        for (int i = 0; i < 9; i++) {//check cols
            if (this.matrix[i][inputJ] == inputValue) {
                System.out.println("Fill conflict");
                return false;
            }
        }


        for (int j = 0; j < 9; j++) {//check rows
            if (this.matrix[inputI][j] == inputValue) {
                System.out.println("Fill conflict");
                return false;
            }
        }

        int startRowIndex = (inputI / 3) * 3;
        int startColIndex = (inputJ / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.matrix[startRowIndex + i][startColIndex + j] == inputValue) {
                    System.out.println("Fill conflict");
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isComplete(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(matrix[i][j]==0)
                    return false;
            }
        }
        return true;
    }

    private void saveToFile() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(fileAddress);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                printWriter.print(matrix[i][j]+",");
            }
            printWriter.println();
        }
    }
}
