package Practice.src.PracticeJDBC;

import java.sql.*;
import java.sql.DriverManager;

public class ExampleUpdate {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;

        String url = "jdbc:mysql://localhost:3306/collection";
        String user = "root";
        String password = "root";
        String updateQuery = "UPDATE Users set city = ? WHERE LastName = ? ";
        try {
            con = DriverManager.getConnection(url,user,password);
            ps = con.prepareStatement(updateQuery);
            ps.setString(1,"Yapral");
            ps.setString(2,"Reddy");

            int rowsUpdated = ps.executeUpdate();

            if(rowsUpdated > 0)
                System.out.println("Record updated successfully");
            else
                System.out.println("Record not found");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
