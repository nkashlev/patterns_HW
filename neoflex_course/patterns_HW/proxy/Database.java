package patterns_HW.proxy;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    Connection connect() throws SQLException;
}
