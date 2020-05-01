/**
* This class provides all the database operations
* dbConnect() - Open db connection
* dbDisconnect() - Close db connection 
* dbExecuteQuery() - Execute search queries Operation returning cachedRowSet 
* dbExecuteUpdate() - Execute given update/insert/delete operation 
* 
* @author Stephen Hardy @ spotpush.com
*/
package util;
/* Imports */
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

    private static final String jdbc_driver = "oracle.jdbc.OracleDriver";
    private static Connection conn = null;
    private static final String oracle_url = "jdbc:oracle:thin:hr/hr@localhost:1521/xepdb1";
    
    public static void dbConnect() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(jdbc_driver);
        } catch (ClassNotFoundException e) {
            System.out.println("Missing Oracle Driver");
            e.printStackTrace();
            throw e;
        }
        System.out.println("Oracle JDBC Driver Registered");
        
        try {
            conn = DriverManager.getConnection(oracle_url);
        } catch (SQLException e) {
            System.out.println("Connection Failure");
            e.printStackTrace();
            throw e;
        }
    }
    
    public static void dbDisconnect() throws SQLException {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static ResultSet dbExecuteQuery(String queryStmt) throws SQLException,
            ClassNotFoundException {
        
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs = null;
        try {
            dbConnect();
            System.out.println("Select statement: "+ queryStmt + "\n");
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(queryStmt);
            crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        } catch (SQLException e) {
            System.out.println("executeQuery operation error : "+ e);
            throw e;
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            dbDisconnect();
        }
        return crs;
        
    }
        
    public static void dbExecuteUpdate(String sqlStmt) throws SQLException,
            ClassNotFoundException {
        Statement stmt = null;
        try {
            dbConnect();
            stmt = conn.createStatement();
            stmt.executeUpdate(sqlStmt);
        } catch (SQLException e) {
            System.out.println("executeUpdate operation error : "+e);
            throw e;
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            dbDisconnect();
        }
    }
    
    public static void main(String[] args) {
    
    }
}
