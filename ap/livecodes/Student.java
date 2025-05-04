package ap.livecodes;

public class Student implements Comparable<Student>{

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

    @Override
    public String toString() {
        return "{'firstName':'"+this.firstName+"' ," +
                "'lastName':'"+this.lastName+"' ," +
                "'address':'"+this.address+"' }";
    }

    @Override
    public boolean equals(Object obj) {
        Student inputStudent = (Student) obj;
        return this.address.equals(inputStudent.address) &&
               this.firstName.equals(inputStudent.firstName) &&
               this.lastName.equals(inputStudent.lastName);
    }

    @Override
    public int compareTo(Student o) {
        if(this.lastName.compareTo(o.lastName)!=0)
            return this.lastName.compareTo(o.lastName);
        else if (this.firstName.compareTo(o.firstName)!=0) {
            return this.firstName.compareTo(o.firstName);
        }
        else
            return this.address.compareTo(o.address);
    }
}
