import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Add {
    public void addStudent() throws SQLException {
        System.out.println("*****************Add Student Information******************");
        System.out.print("How Many Student You Want To Add ? ");
        Scanner scanner = new Scanner(System.in);
        //int num = scanner.nextInt();

        String name;
        int id;

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tusarvai", "root", "");
        Statement statement;


        System.out.println("Give Student  Details :");

        System.out.print("ID   : ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name : ");
        name = scanner.nextLine();

        statement = connection.createStatement();
        String query = "INSERT INTO student VALUES ('"+id+"', '"+name+"')";
        statement.executeUpdate(query);
        System.out.println("Record Inserted Successfully");
    }
}
