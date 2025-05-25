package ap.livecodes.y404.m3.d3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileManager {
    private String saveFilePath;
    private static int saveCounter=0;

    public FileManager(String saveFilePath) {
        this.saveFilePath = saveFilePath;
    }

    public void save(List<String> lines) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(saveFilePath);
        for (String line : lines) {
            out.println(line);
        }
        out.close();
        saveCounter++;
        System.out.println("save counter: "+saveCounter);
    }

    public int getCharCount() throws IOException {
        return Files.lines(Path.of(this.saveFilePath))
                .mapToInt(s -> s.length())
                .sum();
    }

}
