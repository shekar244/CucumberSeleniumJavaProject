package Others;

import java.sql.*;
import java.sql.DriverManager;

public class DatabaseConnection {


    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://0.0.0.0:3333/employees","root","root");
        Statement stmt = con.createStatement();
        String query = "Select * from employees";
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            int eid = rs.getInt("EMPLOYEE_ID");
            String fname = rs.getString("FIRST_NAME");
            String lname = rs.getString("LAST_NAME");
            String city = rs.getString("City");
            System.out.println(eid + " "+fname+ " "+lname+ " "+city);
        }
    }
}
