package ap.lc08_27;

import java.util.Scanner;

public class SystemInputManager {

    private Scanner scanner;

    public SystemInputManager(){
        this.scanner = new Scanner(System.in);
    }


    public String getString(String msg) {
        System.out.print(" : "+msg);
        return scanner.nextLine();
    }

    public int getInt(String msg) {
        System.out.print(" : "+msg);
        return Integer.parseInt(scanner.nextLine());
    }
}
