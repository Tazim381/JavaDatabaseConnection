import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
    Scanner scanner = new Scanner(System.in);

    //database connection
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tusarvai", "root", "");
    Statement statement = connection.createStatement();

    public Delete() throws SQLException {
    }

    public void deleteStudent(){
        System.out.println("*****************Delete Student********************");
        System.out.print("Give Stunet ID : ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();


        String updatQuery = "DELETE FROM student WHERE id = '"+deleteId+"'";
        try {
            statement.executeUpdate(updatQuery);
            System.out.println("delete successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
