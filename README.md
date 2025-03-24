# Java JDBC Project

## Introduction to JDBC
JDBC (Java Database Connectivity) is an API that allows Java applications to interact with databases. It provides a set of interfaces and classes to establish connections, execute SQL queries, and retrieve data from databases. 

### **Why is JDBC Useful?**
1. **Database Connectivity** – Enables Java applications to communicate with relational databases.
2. **Cross-Platform** – Works with multiple databases like MySQL, PostgreSQL, and Oracle.
3. **Secure and Reliable** – Provides transaction management and error handling mechanisms.
4. **Fundamental for Java Development** – Essential for working with databases in Java applications.

---

## How to Run the Project
Follow these steps to set up and run the Java JDBC project.

### **Step 1: Clone the Repository**
```bash
git clone <repo-url>
```

### **Step 2: Open the Project in VS Code**
Open the cloned repository in **Visual Studio Code**.

### **Step 3: Compile and Run Java Files**

#### **Compilation:**
```bash
javac -d bin -cp lib/mysql-connector-j-9.2.0.jar src/JavaJDBC.java
```

#### **Execution:**
```bash
java -cp "bin;lib/mysql-connector-j-9.2.0.jar" JavaJDBC
```

If configured correctly, it will establish a connection to the database.

---

## **Database Setup**
Before running the project, ensure that the required database and table exist in MySQL. Use the following commands to set up the database:

```sql
CREATE DATABASE IF NOT EXISTS zomato_db;
USE zomato_db;
```

The project expects a table named `dinning` with appropriate columns. You can create it using the following SQL command in MySQL:

```sql
CREATE TABLE IF NOT EXISTS dinning (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    cuisine VARCHAR(100) NOT NULL
);
```

Make sure to execute this command in your MySQL database before running the Java code.

---

## Project Structure
```
📦 JavaJDBC-Project
├── 📂 bin
│   ├── CreateAndSelect.class
│   ├── CreateTable.class
│   ├── DeleteData.class
│   ├── InsertData.class
│   ├── JavaJDBC.class
│   ├── ShowColumns.class
│   ├── ShowData.class
│   ├── ShowTables.class
│   ├── UpdateData.class
│
├── 📂 lib
│   ├── mysql-connector-j-9.2.0.jar
│
├── 📂 src
│   ├── CreateTable.java
│   ├── DeleteData.java
│   ├── InsertData.java
│   ├── JavaJDBC.java
│   ├── ShowColumns.java
│   ├── ShowData.java
│   ├── UpdateData.java
```

---

## **JDBC Workflow**
1. **Load JDBC Driver** – The MySQL JDBC driver (mysql-connector.jar) is used to establish the connection.
2. **Establish Connection** – Uses `DriverManager.getConnection()` to connect to the database.
3. **Create and Execute SQL Statements** – Statements like `INSERT`, `SELECT`, `UPDATE`, `DELETE` are executed.
4. **Retrieve Data** – The `ResultSet` object fetches query results.
5. **Close Connection** – Always close the database connection to free up resources.

---

## **Common JDBC Commands Used**
```java
// Load JDBC driver
Class.forName("com.mysql.cj.jdbc.Driver");

// Establish connection
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "user", "password");

// Create Statement
Statement stmt = con.createStatement();

// Execute Query
ResultSet rs = stmt.executeQuery("SELECT * FROM table_name");

// Close Connection
con.close();
```

---

## **Key Features of This Repository**
✅ **Comprehensive Guide** – Covers essential JDBC concepts and practical implementations.
✅ **Hands-on Examples** – Demonstrates database connectivity with MySQL.
✅ **Structured Codebase** – Well-organized project layout for easy navigation.
✅ **Quick Setup** – Simple steps to compile and execute Java JDBC programs.

> **📌 Note:** If you have any suggestions or improvements, feel free to contribute or raise an issue! 🚀

---

## Conclusion
This project provides an understanding of JDBC and demonstrates how to perform database operations in Java. 
