package ap.projects.pacman.examples;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        int k=9;
        int c=15;

        Random rnd = new Random();

        PacmanEngine pacmanEngine = new PacmanEngine(k,c);

        while(true) {

            if(pacmanEngine.getScore() >= c || pacmanEngine.getRemainingTime()<=0){
                break;
            }
            pacmanEngine.printMatrix();
            pacmanEngine.printScore();
            pacmanEngine.printRemainTime();

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}

            int direction=rnd.nextInt(4);
            pacmanEngine.move(direction);
        }
    }
}
