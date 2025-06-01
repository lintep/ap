package ap.livecodes.y404.m3.d11.personsystem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonManagerWithTabSplitFile extends PersonManager {


    public PersonManagerWithTabSplitFile(String fileAddress) throws IOException {
        super(fileAddress);
    }

    @Override
    protected ArrayList<Person> load(String fileAddress) throws IOException {
        return new ArrayList<>(Files.lines(Paths.get(fileAddress))
                .map(s -> s.split("\t"))
                .map(s -> new Person(s[0],Integer.parseInt(s[1])))
                .toList());
    }

    @Override
    protected void saveNewPerson(Person person) throws Exception {
        try (
                PrintWriter pw=new PrintWriter(new FileOutputStream(
                        new File(fileAddress),
                        true /* append = true */))
                )
        {
            pw.println(person);
        }
    }

}
