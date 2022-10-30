import javax.swing.*;
import java.io.Serial;

public class SimplyButtons extends JFrame
{
    public SimplyButtons()
    {
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание панели с двумя кнопками
        JPanel contents = new JPanel();
        contents.add(new JButton("Семья"));
        contents.add(new JButton("Школа"));
        // Замена панели содержимого
        setContentPane(contents);

        // Определение размера окна
        setSize(200, 100);
        // Открытие окна
        setVisible(true);
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false);
        new SimplyButtons();
    }
}