/**.
 *
 * Created by mkyong
 *
 * https://www.mkyong.com/jdbc/how-do-connect-to-postgresql-with-jdbc-driver-java/
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCconnectorTest {

    public static void main(String[] argv) {

        System.out.println("--- PostgreSQL JDBC Connection Testing ----");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Install PostgreSQL JDBC Driver!");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/PetClinic", "postgres",
                    "zxcvbnm");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println(" Connect successful !");
        } else {
            System.out.println(" Connection Failed!");
        }
    }
}