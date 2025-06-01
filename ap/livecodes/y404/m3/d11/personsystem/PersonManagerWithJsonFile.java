package ap.livecodes.y404.m3.d11.personsystem;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonManagerWithJsonFile extends PersonManager {


    public PersonManagerWithJsonFile(String fileAddress) throws IOException {
        super(fileAddress);
    }

    @Override
    protected ArrayList<Person> load(String fileAddress) throws IOException {
        Gson gson = new Gson();
        return new ArrayList<>(Files.lines(Paths.get(fileAddress))
                .map(line -> gson.fromJson(line, Person.class))
                .toList());

    }

    @Override
    protected void saveNewPerson(Person person) throws Exception {
        Gson gson = new Gson();
        try (
                PrintWriter pw=new PrintWriter(new FileOutputStream(
                        new File(super.fileAddress),
                        true /* append = true */))
        )
        {
            pw.println(gson.toJson(person));
        }
    }

}
