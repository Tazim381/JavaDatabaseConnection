import java.sql.*;
import java.util.Scanner;

public class ShowFinalProjectDetails {
    public void showFinalProjectDetails() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tusarvai", "root", "");
        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student Id : ");
        int studentId = scanner.nextInt();

        ResultSet resultSet = statement.executeQuery("SELECT student.id, final_project.teacher_name, final_project.project_name," +
                "student.name FROM final_project, student WHERE final_project.stu_id = student.id");

        System.out.println("*****************Data Show******************");
        System.out.println("ID" + "        " + "NAME" + "               " + "TEACHER NAME" + "      " + "PROJECT NAME");
       while (resultSet.next()){
           System.out.print(resultSet.getString("id") + "      ");
           System.out.print(resultSet.getString("name") + "            ");
           System.out.print(resultSet.getString("teacher_name") + "           ");
           System.out.println(resultSet.getString("project_name") + "      ");

       }
    }
}
