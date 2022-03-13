package day26;

import java.sql.Connection;

public class Insert_data_into_db {

    public static void main(String[] args) {
        String db_url = "jdbc:mysql://localhost:3306/selenium";
        String db_user_id = "root";
        String db_pwd = "root";
        String insertData_query = "insert into students values(7,'Rose','Biswal',0909090)";

        Connection db_connection = DB_Util.getDb_connection(db_url,db_user_id,db_pwd);
        DB_Util.insertRow(db_connection,insertData_query);
    }
}
