package PracticeJDBC;
import java.sql.*;

public class ExampleSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/collection";
        String user = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM USERS";
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                String LName = rs.getString("LastName");
                String FName = rs.getString("FirstName");
                String Address = rs.getString("Address");
                String City = rs.getString("City");
                System.out.println("Users : " + LName + ", "+FName + ", "+Address + ", "+City);

            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
