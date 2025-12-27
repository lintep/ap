package ap.projects.pacman.examples;

import java.util.*;

public class PacmanEngine {

    final private int k;
    final private int c;
    private int pacmanX,pacmanY;
    private int score=0;
    final private long time = 60000 , start =System.currentTimeMillis();
    private char[][] matrix;

    public PacmanEngine(int k , int c){

        this.k = k;
        this.c = c;
        matrix = new char[k+2][k+2];
        Random rnd = new Random();


        for(int i=0; i<k+2 ; i++){
            for(int j=0; j<k+2 ; j++){
                if(i==0 || j==0 || i==k+1 || j==k+1){
                    matrix[i][j] = '*';
                }
                else{
                    matrix[i][j] = ' ';
                }
            }
        }

        this.pacmanX= rnd.nextInt(k)+1;
        this.pacmanY= rnd.nextInt(k)+1;
        matrix[pacmanY][pacmanX] = 'X';

        for(int i=1 ; i<=c ; i++){
            int row = rnd.nextInt(k)+1;
            int column = rnd.nextInt(k)+1;
            while(matrix[row][column] != ' '){
                row = rnd.nextInt(k)+1;
                column = rnd.nextInt(k)+1;
            }
            matrix[row][column] = '.';
        }

    }

    public void printMatrix(){
        for(int i=0 ; i<k+2 ; i++){
            for(int j=0 ; j<k+2 ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void printScore(){
        System.out.println(score);
    }

    public void printRemainTime(){
        System.out.println((time-(System.currentTimeMillis()-start))/1000);
    }

    public void move(int direction){
        switch (direction){
            case 0:
                if(matrix[pacmanY-1][pacmanX]=='*'){
                    System.out.println("Hitting the game wall!");
                }
                else if(matrix[pacmanY-1][pacmanX]=='.'){
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanY--;
                    matrix[pacmanY][pacmanX] = 'X';
                    score++;
                }
                else{
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanY--;
                    matrix[pacmanY][pacmanX] = 'X';
                }
                break;

            case 1:
                if(matrix[pacmanY][pacmanX+1]=='*'){
                    System.out.println("Hitting the game wall!");
                }
                else if(matrix[pacmanY][pacmanX+1]=='.'){
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanX++;
                    matrix[pacmanY][pacmanX] = 'X';
                    score++;
                }
                else{
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanX++;
                    matrix[pacmanY][pacmanX] = 'X';
                }
                break;

            case 2:
                if(matrix[pacmanY+1][pacmanX]=='*'){
                    System.out.println("Hitting the game wall!");
                }
                else if(matrix[pacmanY+1][pacmanX]=='.'){
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanY++;
                    matrix[pacmanY][pacmanX] = 'X';
                    score++;
                }
                else{
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanY++;
                    matrix[pacmanY][pacmanX] = 'X';
                }
                break;

            case 3:
                if(matrix[pacmanY][pacmanX-1]=='*'){
                    System.out.println("Hitting the game wall!");
                }
                else if(matrix[pacmanY][pacmanX-1]=='.'){
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanX--;
                    matrix[pacmanY][pacmanX] = 'X';
                    score++;
                }
                else{
                    matrix[pacmanY][pacmanX] = ' ';
                    pacmanX--;
                    matrix[pacmanY][pacmanX] = 'X';
                }
                break;
        }
    }

    public int getScore(){
        return score;
    }

    public int getRemainingTime(){
        return (int) ((time-(System.currentTimeMillis()-start))/1000);
    }

}

