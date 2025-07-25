package PracticeJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ExampleInsert {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/collection";
        String user = "root";
        String password = "root";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO USERS (LastName,FirstName,Address,CITY) VALUES (? ,? , ? , ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, "Reddy");
            preparedStatement.setString(2, "Shruthi");
            preparedStatement.setString(3, "My Home");
            preparedStatement.setString(4,"Secunderabad");

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A New Users updated successfully");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}