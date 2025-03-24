import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/zomato_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "Tarak@2024"
            );

            Statement statement = connection.createStatement();

            // ✅ UPDATE DATA
            String updateQuery = "UPDATE dinning SET cuisine = 'Mexican' WHERE id = 2";
            int rowsAffected = statement.executeUpdate(updateQuery);
            System.out.println("✅ " + rowsAffected + " row(s) updated in 'restaurants'.");

            connection.close();
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
