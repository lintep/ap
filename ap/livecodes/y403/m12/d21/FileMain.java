package ap.livecodes.y403.m12.d21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("output.txt");
        out.println("hi");
        out.println("123");
        out.println("234");
        out.close();

        Scanner scanner = new Scanner(new File("output.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
