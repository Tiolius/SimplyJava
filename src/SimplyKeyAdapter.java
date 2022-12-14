import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimplyKeyAdapter extends JFrame {

    private JLabel label;

    public SimplyKeyAdapter() {
        super("SimplyKeyAdapter");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setFocusable(true);

        label = new JLabel();
        label.setFont(new Font("Calibri", Font.PLAIN, 20));
        label.setHorizontalAlignment(JLabel.CENTER);

        panel.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent e) {
                label.setText(KeyEvent.getKeyText(e.getKeyCode()));
            }

        });

        panel.add(label, BorderLayout.CENTER);

        setPreferredSize(new Dimension(200, 200));
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                SimplyKeyAdapter frame = new SimplyKeyAdapter();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}