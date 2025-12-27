package ap.lc08_27;

import java.io.FileNotFoundException;

public class SudokuGame {

    private Sudoku sudoku;

    public SudokuGame() throws FileNotFoundException {
        sudoku = new Sudoku("sudoku");
    }

    public void start() throws FileNotFoundException {
        SystemInputManager systemInputManager = new SystemInputManager();

        while (true){

            sudoku.print();

//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter 1 for fill or 2 for remove: ");
//            String line = scanner.nextLine();

            String line = systemInputManager.getString("Enter 1 for fill or 2 for remove: ");

            if(line.equals("1")){ //Integer.parseInt(line)==1

//                System.out.print("Enter i: ");
//                int i=Integer.parseInt(scanner.nextLine());
                int i = systemInputManager.getInt("Enter i");

//                System.out.print("Enter j: ");
//                int j=Integer.parseInt(scanner.nextLine());
                int j=systemInputManager.getInt("Enter j");

//                System.out.print("Enter value: ");
//                int value=Integer.parseInt(scanner.nextLine());
                int value=systemInputManager.getInt("Enter value");

                sudoku.fill(value,i,j);

                if(sudoku.isComplete()){
                    System.out.println("YOU WIN");
                    break;
                }

            } else if (line.equals("2")) {

//                System.out.print("Enter i: ");
//                int i=Integer.parseInt(scanner.nextLine());
//
//                System.out.print("Enter j: ");
//                int j=Integer.parseInt(scanner.nextLine());

                int i = systemInputManager.getInt("Enter i");
                int j=systemInputManager.getInt("Enter j");

                sudoku.remove(i,j);
            }
            else{

            }
        }

    }
}
