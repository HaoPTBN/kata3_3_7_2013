package org.qsoft.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/3/13
 * Time: 1:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionUtils {

    private String driver = "com.mysql.jdbc.Driver";
    private String stringConnection = "jdbc:mysql://localhost:3306/db_junit_test";
    private String username = "root";
    private String password = "";

    public Connection getConnection() {
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(stringConnection, username, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
