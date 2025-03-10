package ap.livecodes;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student();
        student.lastName="میر محمد رضایی راد";
        System.out.println(student.getLastNamePostfix());
    }
}
