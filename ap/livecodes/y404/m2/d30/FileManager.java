package ap.livecodes.y404.m2.d30;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class FileManager {

    public static void save(List<String> lines, String saveFilePath) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(saveFilePath);
        for (String line : lines) {
            out.println(line);
        }
        out.close();
    }

}
