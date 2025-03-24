package ap.livecodes;

public class Student {

    private String firstName;
    private String lastName;
    private String address;

    public Student(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void setLastName(String lastName) {
        if(lastName.length()>2)
            this.lastName = lastName;
        else
            System.out.println("lastName length < 2");
    }

    public String getLastNamePostfix(){
        String[] split = lastName.split(" ");
        return split[split.length-1];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
}
