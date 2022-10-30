import javax.swing.*;
import java.awt.event.*;

public class SimplyJDialog extends JFrame
{
    public SimplyJDialog() {
        super("DialogWindows");
        // ����� �� ��������� ��� ��������
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // ������ ��� �������� ���������� ����
        JButton button1 = new JButton("����������� ����");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = createDialog("�����������", false);
                dialog.setVisible(true);
            }
        });
        JButton button2 = new JButton("��������� ����");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = createDialog("���������", true);
                dialog.setVisible(true);
            }
        });
        // �������� ������ ����������� � ����������� ������
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(button2);
        setContentPane(contents);
        // ����������� ������� � �������� ����
        setSize(350, 100);
        setVisible(true);
    }
    /** ������� �������� ����������� ����.
     * @param title - ��������� ����
     * @param modal - ���� �����������
     */
    private JDialog createDialog(String title, boolean modal)
    {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(180, 90);
        return dialog;
    }

    public static void main(String[] args)
    {
        new SimplyJDialog();
    }
}