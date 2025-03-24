import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowColumns {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/zomato_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "XXXXXXX"
            );

            Statement statement = connection.createStatement();

            // ✅ SHOW COLUMNS QUERY
            String tableName = "dinning"; // Change this to your table name
            ResultSet resultSet = statement.executeQuery("SHOW COLUMNS FROM " + tableName);

            System.out.println("Columns in the table '" + tableName + "':");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Field") + " | " + resultSet.getString("Type"));
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
