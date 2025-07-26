package Practice.src.PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleDeleteRow {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/collection";
        String user = "root";
        String password = "root";

        String query = "DELETE FROM Users WHERE LastName = ? ";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,"Reddy");

            int rowsEffected = ps.executeUpdate();
            if(rowsEffected > 0)
                System.out.println("Deleted the record");
            else
                System.out.println("Record was not found");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
