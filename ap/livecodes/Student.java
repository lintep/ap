package ap.livecodes;

public class Student {

    private String firstName;
    public String lastName;
    private String address;

    public String getLastNamePostfix(){
        String[] split = lastName.split(" ");
        return split[split.length-1];
    }
}
