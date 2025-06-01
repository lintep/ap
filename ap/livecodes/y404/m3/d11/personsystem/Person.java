package ap.livecodes.y404.m3.d11.personsystem;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.age;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Person personObj = (Person) obj;
        return this.name.equals(personObj.name) && this.age == personObj.age;
    }
}
