import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;


public class SimplyActionListener extends JFrame
{
    private JTextArea textArea;

    public static BufferedImage scaleBilinear(BufferedImage before, double scale) {
        return scale(before, scale);
    }

    private static BufferedImage scale(final BufferedImage before, final double scale) {
        int w = before.getWidth();
        int h = before.getHeight();
        int w2 = (int) (w * scale);
        int h2 = (int) (h * scale);
        BufferedImage after = new BufferedImage(w2, h2, before.getType());
        AffineTransform scaleInstance = AffineTransform.getScaleInstance(scale, scale);
        AffineTransformOp scaleOp = new AffineTransformOp(scaleInstance, 2);
        scaleOp.filter(before, after);
        return after;
    }

    public SimplyActionListener() {

        super("Test frame");
        createGUI();
    }
    
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Removes the dotted border around controls which is not consistent with Windows
        UIManager.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
        UIManager.put("ToggleButton.focus", new ColorUIResource(new Color(0, 0, 0, 0)));

        // ways to remove it from other controls...
        UIManager.put("CheckBox.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
        UIManager.put("TabbedPane.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
        UIManager.put("RadioButton.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
        UIManager.put("Slider.focus", new ColorUIResource(new Color(0, 0, 0, 0)));

        // figure out combobox
        UIManager.put("ComboBox.focus", new ColorUIResource(new Color(0, 0, 0, 0)));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button1");

        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("images/kitty1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        myPicture = SimplyActionListener.scaleBilinear(myPicture,0.2);
        ImageIcon imageIcon = new ImageIcon(myPicture);
        JLabel picLabel = new JLabel(imageIcon);
        panel.add(picLabel);
        button1.setActionCommand("Button 1 was pressed!");
        panel.add(button1);

        JButton button2 = new JButton("Button2");
        button2.setActionCommand("Button 2 was pressed!");
        panel.add(button2);

        JButton button3 = new JButton("Button3");
        button3.setActionCommand("Button 3 was pressed!");
        panel.add(button3);

        textArea = new JTextArea();
        textArea.setRows(3);
        textArea.setColumns(30);
        textArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.add(textArea);

        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(500, 230));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textArea.setText(e.getActionCommand());
        }
    }

        
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(false);
            SimplyActionListener frame = new SimplyActionListener();
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

}