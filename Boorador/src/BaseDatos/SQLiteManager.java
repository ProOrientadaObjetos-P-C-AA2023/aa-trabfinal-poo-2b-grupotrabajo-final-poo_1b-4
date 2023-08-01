package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteManager {
    private static final String DB_NAME = "mov_utpl.db";
    private static Connection connection = null;
    
    public static Connection getConnection() throws SQLException{
        if (connection == null) {
            try{
                connection = DriverManager.getConnection("jdbc:sqlite" + DB_NAME);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
    }
}
