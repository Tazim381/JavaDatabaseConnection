import java.sql.*;

public class Show {
    public void showStudent() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tusarvai", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

        System.out.println("*****************Data Show******************");
        while (resultSet.next()){
            System.out.print("ID   : " + resultSet.getString("id"));
            System.out.print("      ");
            System.out.println("NAME : " + resultSet.getString("name"));
        }
    }
}
