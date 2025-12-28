package ap.lc10_07;

public class Passenger {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Passenger(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public void print(){
//        System.out.println(toString());
//        System.out.println(this.toString());
        System.out.println(this);
    }
}
