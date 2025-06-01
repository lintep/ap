package ap.livecodes.y404.m3.d11.personsystem;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonManagerWithSqlite extends PersonManager {

    public PersonManagerWithSqlite(String fileAddress) throws IOException {
        super(fileAddress);
    }

    @Override
    protected ArrayList<Person> load(String fileAddress) throws IOException {
        try(
                        // create a database connection
                        Connection connection = DriverManager.getConnection("jdbc:sqlite:"+fileAddress);
                        Statement statement = connection.createStatement();
        )
        {
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            ResultSet rs = statement.executeQuery("select * from person");
            ArrayList<Person> result=new ArrayList<>();
            while(rs.next())
            {
                Person person = new Person(rs.getString("name"),rs.getInt("age"));
                result.add(person);
            }
            return result;
        }
        catch(SQLException e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            e.printStackTrace(System.err);
        }
        return null;
    }

    @Override
    protected void saveNewPerson(Person person) throws Exception {
        try
                (
                        // create a database connection
                        Connection connection = DriverManager.getConnection("jdbc:sqlite:person.db");
                        Statement statement = connection.createStatement();
                ) {
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            statement.executeUpdate("insert into person values('"+person.getName()+"', "+person.getAge()+")");

        }
    }

}
