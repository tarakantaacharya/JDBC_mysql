import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/zomato_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "Tarak@2024"
            );

            Statement statement = connection.createStatement();

            // ✅ INSERT DATA
            String insertQuery = "INSERT INTO dinning (id, name, cuisine) VALUES (1, 'Tasty Bites', 'Indian'), (2, 'Pasta Hub', 'Italian')";
            int rowsAffected = statement.executeUpdate(insertQuery);
            System.out.println("✅ " + rowsAffected + " rows inserted into 'restaurants'.");

            connection.close();
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
