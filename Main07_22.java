import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main07_22 {

    public static void main(String[] args) throws FileNotFoundException {
        int[][] sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j]=0;
            }
        }

        Scanner scanner = new Scanner(new File("sudoku"));
        int i=0;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] split = line.split(",");
//            for (String s : split) {
            for (int j = 0; j < 9; j++) {
                if (j >= split.length) {
                    sudoku[i][j] = 0;
                    continue;
                }
                String s = split[j];
//                System.out.print(s+"\t");
                int value =0;
                if(s.length()==1)
                    value = Integer.parseInt(s);
                sudoku[i][j]=value;
            }
//            System.out.println();
            i++;
        }
        scanner.close();

        print(sudoku);
    }

    static void print(int[][] sudoku){

        for (int i = 0; i < 9; i++) {
            if(i%3==0)
                System.out.println("__________________");
            for (int j = 0; j < 9; j++) {
                if(j%3==0)
                    System.out.print("|\t");
                System.out.print(sudoku[i][j]+"\t");
            }
            System.out.println();
        }

    }

    static void f1(String[] args) {
        double[] array = Main07_20.ijadeArraye();

        for (int i = 0; i < array.length; i++) {
            double item = array[i];
            System.out.println(item);
        }

        for (double item : array) {
            System.out.println(item);
        }
    }
}
