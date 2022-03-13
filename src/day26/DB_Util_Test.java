package day26;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Util_Test {
    public static void main(String[] args) throws SQLException {

        String db_url = "jdbc:mysql://localhost:3306/selenium";
        String db_user_id = "root";
        String db_pwd = "root";
        String query = "select * from students";

//        String query_total_row= "SELECT COUNT(*) AS rowCount FROM ";
        String table_name = "students";

        Connection db_connection = DB_Util.getDb_connection(db_url,db_user_id,db_pwd);

        //Count total rows
       int totalRows= DB_Util.totalRows(db_connection, table_name);
       System.out.println("Total no of rows ->"+totalRows);

        DB_Util.getDataFromDatabase(db_connection,query);

        ResultSet studentsData =DB_Util.getDataFromDatabase(db_connection,query);

        while (studentsData.getRow()<totalRows){
            studentsData.next();
            System.out.print(studentsData.getInt(1)+" ");
            System.out.print(studentsData.getString(2)+" ");
            System.out.print(studentsData.getString("l_name")+" ");
            System.out.print(studentsData.getInt("phone_no")+" ");
            System.out.println();
        }


        DB_Util.closeDatabaseConnection(db_connection);


    }
}
