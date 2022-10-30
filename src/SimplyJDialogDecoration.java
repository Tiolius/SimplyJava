

// ���������� ���� Swing

import javax.swing.*;

public class SimplyJDialogDecoration
{
    public static void main(String[] args)
    {
        // ����������� ��������� ��� ����
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        // �������� ���� � ������
        JFrame frame = new JFrame("O��o � ������");
        // ����������� ������� ���������� ������ ���������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
        // �������� ����������� ����
        JDialog dialog = new JDialog(frame, "���������� ����");
        // ����������� ������� ���������� ������ ����������� ����
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(150, 100);
        // ����������� ���� ���������� ����������� ����
        dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        dialog.setVisible(true);
    }
}