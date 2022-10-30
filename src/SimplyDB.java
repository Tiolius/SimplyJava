import java.sql.*;

public class SimplyDB {
    public static final String DB_URL = "jdbc:sqlite:C:\\Projects\\Java\\db\\database.db";

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Connection connection = DriverManager.getConnection(DB_URL);//���������� � ��
            System.out.println("���������� � ���� ���������.");
            connection.close();       // ���������� �� ��
            System.out.println("���������� �� ���� ���������.");
        } catch (SQLException e) {
            e.printStackTrace(); // ��������� ������  DriverManager.getConnection
            System.out.println("������ SQL !");
        }
    }
}
