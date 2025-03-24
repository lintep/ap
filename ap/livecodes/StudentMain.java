package ap.livecodes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StudentMain {

    public static void main(String[] args) throws FileNotFoundException {

        Student student = new Student("ali","mir mohammad rezaee rad","zanjan");
//        student.setLastName("میر محمد رضایی راد");
//        System.out.println(student.getLastNamePostfix());

//        saveStudent(student,"student.txt");
        saveStudentInLine(student,"student.txt");

        System.out.println("Save complete.");
    }

    public static void saveStudent(Student student, String fileAddress) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileAddress);
        out.println(student.getFirstName());
        out.println(student.getLastName());
        out.println(student.getAddress());
        out.close();

    }

    public static void saveStudentInLine(Student student, String fileAddress) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(fileAddress);
        out.print(student.getFirstName());
        out.print("\t");
        out.print(student.getLastName());
        out.print("\t");
        out.print(student.getAddress());
        out.close();

    }
}
