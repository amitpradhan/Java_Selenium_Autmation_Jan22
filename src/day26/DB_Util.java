package day26;

import java.sql.*;

public class DB_Util {

    /**
     * 1-Registering MySQl driver
     * 2- establish a connection
     * 3- Return the db connection
     * @param db_url
     * @param db_userid
     * @param db_pwd
     * @return
     */
    public static Connection getDb_connection(String db_url,String db_userid,String db_pwd){
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             connection = DriverManager.getConnection(db_url, db_userid, db_pwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 3- create statement
     * 4- Execute query
     * 5- Return resultSet
     *
     * @param query
     * @return
     */

    public static ResultSet getDataFromDatabase(Connection connection,String query){
        ResultSet resultSet = null;
        Statement statement = null;
          try {
            statement = connection.createStatement();
            resultSet= statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;
    }

    /**
     * 6- Close connection
     * @param connection
     */
    public static void closeDatabaseConnection(Connection connection){
        try {

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int totalRows(Connection connection, String tableName){
        String query_total_row= "SELECT COUNT(*) AS rowCount FROM ";
        ResultSet rowCountResultSet=DB_Util.getDataFromDatabase(connection,query_total_row+tableName);
        int totalRows = 0;

        try {
            rowCountResultSet.next();
            totalRows= rowCountResultSet.getInt("rowCount");
//            System.out.println("Total no of rows ->"+totalRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  totalRows;
    }
}
