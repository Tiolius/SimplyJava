import java.sql.SQLException;

public class db_main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        db_conn.Conn();
        db_conn.CreateDB();
        db_conn.WriteDB();
        db_conn.ReadDB();
        db_conn.CloseDB();
    }
}