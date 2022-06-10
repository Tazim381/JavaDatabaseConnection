import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddFinalProject {

    public void addFinalProject() throws SQLException {
        System.out.println("*****************Add Student Final Project Details******************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student ID : ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Teacher Name : ");
        String teacherName = scanner.nextLine();
        System.out.print("Project Name : ");
        String projectName = scanner.nextLine();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tusarvai", "root", "");
        Statement statement;

        statement = connection.createStatement();
        String query = "INSERT INTO final_project VALUES ('"+studentId+"', '"+teacherName+"', '"+projectName+"')";
        statement.executeUpdate(query);
        System.out.println("Record Inserted Successfully");

//        System.out.println("ok");
    }
}
