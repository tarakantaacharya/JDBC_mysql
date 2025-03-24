import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/zomato_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "XXXX"
            );

            Statement statement = connection.createStatement();

            // ✅ DELETE DATA
            String deleteQuery = "DELETE FROM dinning WHERE id = 1";
            int rowsAffected = statement.executeUpdate(deleteQuery);
            System.out.println("✅ " + rowsAffected + " row(s) deleted from 'restaurants'.");

            connection.close();
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
