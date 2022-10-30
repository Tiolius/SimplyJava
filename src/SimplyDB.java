import java.sql.*;

public class SimplyDB {
    public static final String DB_URL = "jdbc:sqlite:C:\\Projects\\Java\\db\\database.db";

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Connection connection = DriverManager.getConnection(DB_URL);//соединение с БД
            System.out.println("Соединение с СУБД выполнено.");
            connection.close();       // отключение от БД
            System.out.println("Отключение от СУБД выполнено.");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
            System.out.println("Ошибка SQL !");
        }
    }
}
