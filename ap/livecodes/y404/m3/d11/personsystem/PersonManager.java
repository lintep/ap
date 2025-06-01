package ap.livecodes.y404.m3.d11.personsystem;

//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class PersonManager {

    protected String fileAddress;

    protected ArrayList<Person> personList;

    public PersonManager(String fileAddress) throws IOException {
        this.fileAddress=fileAddress;
        personList = load(fileAddress);
    }

    protected abstract ArrayList<Person> load(String fileAddress) throws IOException;


    final public int getCount() {
        return personList.size();
    }

    public List<Person> searchByName(String name) {
        return this.personList.stream()
                .filter(s -> s.getName().toLowerCase().indexOf(name)>=0)
                .toList();
    }

    public int getUniqueCount(){
        return this.personList.stream().collect(Collectors.toSet()).size();
    }

    public void add(Person person) throws Exception {
        this.personList.add(person);
        saveNewPerson(person);
    }

    protected abstract void saveNewPerson(Person person) throws Exception ;
}
