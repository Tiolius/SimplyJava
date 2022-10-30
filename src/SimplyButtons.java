import javax.swing.*;
import java.io.Serial;

public class SimplyButtons extends JFrame
{
    public SimplyButtons()
    {
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // �������� ������ � ����� ��������
        JPanel contents = new JPanel();
        contents.add(new JButton("�����"));
        contents.add(new JButton("�����"));
        // ������ ������ �����������
        setContentPane(contents);

        // ����������� ������� ����
        setSize(200, 100);
        // �������� ����
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false);
        new SimplyButtons();
    }
}