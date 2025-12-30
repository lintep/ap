package ap.lc10_09;

import java.io.FileNotFoundException;

public class Main2 {

    public static void main(String[] args) throws FileNotFoundException {
        TextFileReader textFileReader = new TextFileReader("C:\\Users\\User-Kara-Laptop\\Desktop\\znu\\ap\\src\\ap\\student.txt");
        for (String line :textFileReader){
            System.out.println(line);
        }
    }
}
