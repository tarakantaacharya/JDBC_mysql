import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/zomato_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "Tarak@2024"
            );

            Statement statement = connection.createStatement();

            // ✅ CREATE TABLE IF NOT EXISTS
            String createTableQuery = "CREATE TABLE IF NOT EXISTS dinning ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(255) NOT NULL, "
                    + "cuisine VARCHAR(100) NOT NULL"
                    + ")";
            statement.executeUpdate(createTableQuery);
            System.out.println("✅ Table 'dinning' created successfully (or already exists).");

            connection.close();
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
