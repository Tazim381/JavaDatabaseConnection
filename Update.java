import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

    Scanner scanner = new Scanner(System.in);

    //database connection
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tusarvai", "root", "");
    Statement statement = connection.createStatement();

    public Update() throws SQLException {
    }

    public void updateStudent()
    {
        System.out.println("*****************Update Student Information******************");
        System.out.print("Give Stunet ID : ");
        int updateId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Give Stunet Name : ");
        String updateName = scanner.nextLine();

        String updatQuery = "UPDATE student SET name = '"+updateName+"' WHERE id = '"+updateId+"'";

        try {
            statement.executeUpdate(updatQuery);
            System.out.println("Update Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
//bayazid vai 