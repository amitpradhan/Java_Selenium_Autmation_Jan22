package day26;

import java.sql.*;

public class Jdbc_connection_demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String db_url = "jdbc:mysql://localhost:3306/selenium";
        String user_id = "root";
        String pwd = "root";

        String query = "select * from students";

        //1-Registering MySQl driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2- establish a connection
        Connection connection = DriverManager.getConnection(db_url, user_id, pwd);

        //3- create statement
        Statement statement = connection.createStatement();

        //4-Execute query
        ResultSet resultSet = statement.executeQuery(query);

        //5- dealing with data
//        System.out.println(resultSet);
        resultSet.next();
        System.out.print(resultSet.getInt(1)+" ");
        System.out.print(resultSet.getString(2)+" ");
        System.out.print(resultSet.getString("l_name")+" ");
        System.out.print(resultSet.getInt("phone_no")+" ");
        resultSet.next();
        System.out.println();
        System.out.print(resultSet.getInt(1)+" ");
        System.out.print(resultSet.getString(2)+" ");
        System.out.print(resultSet.getString("l_name")+" ");
        System.out.print(resultSet.getInt("phone_no")+" ");

        resultSet.next();
        System.out.println();
        System.out.print(resultSet.getObject(1) +" ");
        System.out.print(resultSet.getObject(2)+" ");
        System.out.print(resultSet.getObject("l_name")+" ");
        System.out.print(resultSet.getObject("phone_no")+" ");

        resultSet.next();
        System.out.println();
        System.out.print(resultSet.getObject(1) +" ");
        System.out.print(resultSet.getObject(2)+" ");
        System.out.print(resultSet.getObject("l_name")+" ");
        System.out.print(resultSet.getObject("phone_no")+" ");

        //6- close connection
        statement.close();
        connection.close();



    }
}
