package JDBCconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class OracleDBconnect {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.0.6:1521:XE", "SYSTEM", "sashwin77");

            if (con != null)
                System.out.println("Connected");
            else
                System.out.println("Not Connected");

            con.close();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
