package ap.projects.pacman;

import java.util.*;
public class PacmanSample1 {

    public static void clearConsole() {
        System.out.print("\033[H\033[2J"); // ANSI escape code
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is some text.");
        Thread.sleep(2000); // Wait 2 seconds
        clearConsole();
        System.out.println("Screen cleared!");
    }

    public static void clearConsole2() {
        System.out.println("clearing console");
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                // For Windows
                System.out.println("for win");
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Linux and macOS
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main2(String[] args){
        System.out.println("Please enter an integer:");
        Scanner input = new Scanner(System.in);

        clearConsole();

        int k = input.nextInt();
        char[][] stars = new char[k+2][k+2];

        for(int i=0 ; i<k+2 ; i++){
            stars[0][i]='*';
            stars[k+1][i]='*';
        }

        for(int i=1 ; i<k+1 ; i++){
            for(int j=0; j<k+2 ; j++){
                if(j==0 || j==k+1){
                    stars[i][j]='*';
                } else{
                    stars[i][j]=' ';
                }
            }
        }

        int row=1;
        int column=1;
        stars[row][column] = 'X';
        for(int i=0 ; i<k+2 ; i++){
            for(int j=0 ; j<k+2 ; j++){
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        while(true){
            int rowCopy = row;
            int columnCopy = column;
            stars[row][column] = ' ';
            char movement = input.next().charAt(0);
            switch (movement){
                case 'w':
                    row--;
                    break;
                case 'd':
                    column++;
                    break;
                case 's':
                    row++;
                    break;
                case 'a':
                    column--;
                    break;
                case 'q':
                    System.out.println("Exit");
                    break;
                default :
                    System.out.println("Warning");
            }
            if(movement == 'q'){
                break;
            } else if(movement !='w' && movement !='s' && movement !='a' && movement !='d'){
                continue;
            }
            else{
                if(stars[row][column] == '*'){
                    System.out.println("Hitting the game wall!");
                    row = rowCopy;
                    column = columnCopy;
                } else{
                    stars[row][column] = 'X';
                    for(int i=0 ; i<k+2 ; i++){
                        for(int j=0 ; j<k+2 ; j++){
                            System.out.print(stars[i][j]);
                        }
                        System.out.println();
                    }
                }
            }
        }
    }

}
