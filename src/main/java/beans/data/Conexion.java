package beans.data;

import java.sql.*;




public class Conexion {

    public static Connection getConnection() throws SQLException {
        if (System.getenv("RDS_HOSTNAME") != null) {

            String dbName = System.getenv("RDS_DB_NAME");
            String userName = System.getenv("RDS_USERNAME");
            String password = System.getenv("RDS_PASSWORD");
            String hostname = System.getenv("RDS_HOSTNAME");
            String port = System.getenv("RDS_PORT");
            String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
            Connection con = DriverManager.getConnection(jdbcUrl);
            return con;

        }
        return null;
    }






    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement ps) {
        try {
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }

}
