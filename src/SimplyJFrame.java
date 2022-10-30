import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimplyJFrame extends JFrame
{
    private static int    counter = 0; // �������
    private static JLabel label   = null;
    private static final String TEMPL   = "�������� ���� (������� %d)";
    public SimplyJFrame ()
    {
        // �������� ���� � ����������
        JFrame frame = new JFrame("JFrameWindowListener");
        // �� ��������� ���� �� ������� �� ������ � ���������
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // ����������� ��������� ����
        frame.addWindowListener(new WindowListener() {

            public void windowActivated  (WindowEvent event) {}
            public void windowClosed     (WindowEvent event) {}
            public void windowDeactivated(WindowEvent event) {}
            public void windowDeiconified(WindowEvent event) {}
            public void windowIconified  (WindowEvent event) {}
            public void windowOpened     (WindowEvent event) {}
            // ����� ��������� ������� "�������� ����"
            public void windowClosing (WindowEvent event) {
                if (++counter == 3) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                } else
                    label.setText(String.format(TEMPL, counter));
            }
        });
        label = new JLabel(String.format(TEMPL, counter));
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(250, 80));
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new SimplyJFrame();
    }
}