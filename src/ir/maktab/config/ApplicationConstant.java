package ir.maktab.config;

import java.sql.Connection;

public class ApplicationConstant {
    private static Connection connection = new DatabaseConnection().getConnection();

    public static Connection getConnection() {
        return connection;
    }
}
