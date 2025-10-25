package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private static Connection connection = null;
    private static boolean isConnectedPrinted = false; // ✅ flag added

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/filehider?useSSL=false&allowPublicKeyRetrieval=true",
                        "root",
                        "harsh@2004"
                );

                if (!isConnectedPrinted) {
                    System.out.println("✅ MYSQL Connection is Successful..");
                    isConnectedPrinted = true;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                isConnectedPrinted = false;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
