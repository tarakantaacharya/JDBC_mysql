import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowData {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/zomato_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "Tarak@2024"
            );

            Statement statement = connection.createStatement();

            // ✅ SHOW ROWS QUERY
            String tableName = "dinning"; // Change this to your table name
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName);

            System.out.println("Rows in the table '" + tableName + "':");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " | " + 
                                   resultSet.getString("name") + " | " + 
                                   resultSet.getString("cuisine"));
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
