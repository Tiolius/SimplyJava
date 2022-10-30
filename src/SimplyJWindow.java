// ������ ������������� ���� ��� ����� JWindow
import javax.swing.*;

import java.awt.*;

public class SimplyJWindow extends JWindow
{
    // ����������� "�������� �����"
    private Image capture;

    // ����� ���������� �����������
    static class ImageDraw extends JComponent
    {
        private final Image capture;
        ImageDraw (Image capture) {
            this.capture = capture;
        }
        public void paintComponent(Graphics g) {
            // ���������� �����������
            g.drawImage(capture, 0, 0, this);
        }
    }

    public SimplyJWindow() {
        super();
        // ����������� ��������� ���� �� ������
        setLocation(200, 100);
        // ����������� ������� ����
        // ������ ����
        int window_w = 300;
        int window_h = 300;
        setSize (window_w, window_h);
        try {
            // "��������" ����� ����������� "�������� �����"
            Robot robot = new Robot();
            capture = robot.createScreenCapture(
                    new Rectangle(5, 5, window_w, window_h));
        } catch (Exception ex) { ex.printStackTrace(); }
        // ��������� � ��������� �����������
        getContentPane().add(new ImageDraw(capture));
        // ��������� ����
        setVisible(true);
        try {
            // ����������� ������ ����� 10 ���
            Thread.sleep(10000);
        } catch (Exception ignored) { }
        System.exit(0);
    }
    public static void main(String[] args) {
        new SimplyJWindow();
    }
}