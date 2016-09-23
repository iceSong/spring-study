package hello;

import java.sql.*;

/**
 * TODO
 *
 * @author song@liu@ele.me
 * @date 2016-09-22 18:23
 */
public class DbFactory {
    private static Connection conn;
    private static String uri = "jdbc:mysql://localhost:3306/demo?"
            + "user=root&password=BINGsong&useUnicode=true&characterEncoding=UTF8";

    public static Statement getStatement() {
        Statement statement = null;
        getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return statement;
        }
    }

    public static PreparedStatement prepareStatement(String sql) {
        PreparedStatement statement = null;
        getConnection();
        try {
            statement = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return statement;
        }
    }

    private static void getConnection() {
        if (conn == null) {
            synchronized (DbFactory.class) {
                if (conn == null) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        conn = DriverManager.getConnection(uri);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
