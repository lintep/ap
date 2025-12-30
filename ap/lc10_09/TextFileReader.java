package ap.lc10_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class TextFileReader implements Iterator<String>,Iterable<String> {
    private Scanner scanner;
    private int lineNumber=0;

    public TextFileReader(String fileName) throws FileNotFoundException {
        this.scanner=new Scanner(new File(fileName));
    }

    public void close(){
        this.scanner.close();
    }

    @Override
    public boolean hasNext() {
        return this.scanner.hasNext();
    }

    @Override
    public String next() {
        return ++lineNumber +": "+this.scanner.nextLine();
    }

    @Override
    public Iterator<String> iterator() {
        lineNumber=0;
        return this;
    }
}
