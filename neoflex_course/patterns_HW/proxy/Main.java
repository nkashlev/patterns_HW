package patterns_HW.proxy;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String dbName = "mydb";
        String proxyHost = "localhost";
        int proxyPort = 8080;

        Database databaseProxy = new DatabaseProxy(dbName, proxyHost, proxyPort);
        try {
            Connection connection = databaseProxy.connect();
            // выполнение SQL-запросов
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
