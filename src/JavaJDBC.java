import java.sql.Connection;
import java.sql.DriverManager;

public class JavaJDBC {
    public static void main(String[] args) {
        try {
            // No need for Class.forName() in Java 11+
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/zomato_db", "root", "XXXXX"
            );

            if (connection != null) {
                System.out.println("✅ Connected to the database!");
            } else {
                System.out.println("❌ Connection failed!");
            }

            connection.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

// PS D:\.vscode\WebTechnologiesLab\JDBCConnection> javac -d bin -cp lib/mysql-connector.jar src/JavaJDBC.java
// PS D:\.vscode\WebTechnologiesLab\JDBCConnection> java -cp "bin;lib/mysql-connector-j-9.2.0.jar" JavaJDBC   
// ? Connected to the database!
