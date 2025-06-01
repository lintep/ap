package ap.livecodes.y404.m3.d11.personsystem;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        PersonManager personManager = new PersonManagerWithTabSplitFile("person.txt");
//        PersonManager personManager = new PersonManagerWithJsonFile("person.json");
        PersonManager personManager = new PersonManagerWithSqlite("person.db");
        System.out.println(personManager.getCount());
        System.out.println(personManager.searchByName("a"));
        personManager.add(new Person("Mohsen",17));
        personManager.add(new Person("Mohsen",17));
        System.out.println(personManager.getCount());
        System.out.println(personManager.getUniqueCount());
    }

    public static void main2(String[] args) throws IOException {
        List<String> linesTabSplit = Files.lines(Paths.get("person.txt")).toList();
        linesTabSplit.stream().forEach(s -> System.out.println(s));
        System.out.println("______________");

        List<Person> personList1 = linesTabSplit.stream()
                .map(s -> s.split("\t"))
                .map(s -> new Person(s[0],Integer.parseInt(s[1])))
                        .toList();


        List<Person> personList2 = new ArrayList<>();
        for (String line : linesTabSplit) {
            String[] split = line.split("\t");
            Person person = new Person(split[0],Integer.parseInt(split[1]));
            personList2.add(person);
        }



        Gson gson = new Gson();

        List<Person> personList3 = Files.lines(Paths.get("person.json"))
                .map(line -> gson.fromJson(line, Person.class))
                .toList();

        personList1.forEach(s -> System.out.println(s));
        System.out.println("______________");
        personList2.forEach(s -> System.out.println(s));
        System.out.println("______________");
        personList3.forEach(s -> System.out.println(s));
    }

    public static void main0(String[] args) throws FileNotFoundException {
        Person person1 = new Person("Ali",32);
        Person person2 = new Person("Reza",23);
        Person person3 = new Person("Sara",27);

        PrintWriter printWriter = new PrintWriter(new File("person.txt"));
        printWriter.println(person1);
        printWriter.println(person2.toString());
        printWriter.println(person3);
        printWriter.close();

        System.out.println("__________________");


        PrintWriter printWriterJson = new PrintWriter(new File("person.json"));
        Gson gson = new Gson();
        printWriterJson.println(gson.toJson(person1));
        printWriterJson.println(gson.toJson(person2));
        printWriterJson.println(gson.toJson(person3));
        printWriterJson.close();

        System.out.println("Operation complete.");
    }

}
