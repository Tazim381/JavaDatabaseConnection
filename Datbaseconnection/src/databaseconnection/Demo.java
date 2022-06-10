package databaseconnection;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial" , "root","");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from employee");

        System.out.println("Printing Employee table :");

        while(rs.next())
        {
           System.out.println(rs.getInt(1)+" "+rs.getString(2));

       }
        ResultSet rs1 = statement.executeQuery("select * from worker");
        System.out.println();
        System.out.println("Printing Worker table :");
        while(rs1.next())
        {
            System.out.println(rs1.getInt(1)+" "+rs1.getInt(2)+" "+rs1.getInt(3));

        }

       // String sql ="INSERT INTO employee VALUES(386,'Nafiz')";
        //statement.executeUpdate(sql);
        //String query = " select Name,Salary from employee,worker where employee.ID = worker.ID;";
        System.out.println();
        System.out.println("Printing Join Query : ");

        ResultSet rs2 = statement.executeQuery(" select Name,Salary from employee,worker where employee.ID = worker.ID");
        while(rs2.next())
        {
            System.out.println(rs2.getString(1)+ " "+ rs2.getInt(2));
        }


        connection.close();
    }
}
