package databaseconnection;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial" , "root","");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from employee");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));

        }

        String sql ="INSERT INTO employee VALUES(384,'Ajoy')";
        statement.executeUpdate(sql);
        connection.close();
    }
}
