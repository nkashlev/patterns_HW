package patterns_HW.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseProxy implements Database {
    private final String dbName;
    private final String proxyHost;
    private final int proxyPort;

    public DatabaseProxy(String dbName, String proxyHost, int proxyPort) {
        this.dbName = dbName;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    public Connection connect() throws SQLException {
        String url = "jdbc:mysql://" + proxyHost + ":" + proxyPort + "/" + dbName;
        return DriverManager.getConnection(url);
    }
}
