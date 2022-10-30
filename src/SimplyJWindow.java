// Пример использования окна без рамки JWindow
import javax.swing.*;

import java.awt.*;

public class SimplyJWindow extends JWindow
{
    // изображение "рабочего стола"
    private Image capture;

    // Класс прорисовки изображения
    static class ImageDraw extends JComponent
    {
        private final Image capture;
        ImageDraw (Image capture) {
            this.capture = capture;
        }
        public void paintComponent(Graphics g) {
            // Прорисовка изображения
            g.drawImage(capture, 0, 0, this);
        }
    }

    public SimplyJWindow() {
        super();
        // Определение положение окна на экране
        setLocation(200, 100);
        // Определение размера окна
        // Размер окна
        int window_w = 300;
        int window_h = 300;
        setSize (window_w, window_h);
        try {
            // "Вырезаем" часть изображения "рабочего стола"
            Robot robot = new Robot();
            capture = robot.createScreenCapture(
                    new Rectangle(5, 5, window_w, window_h));
        } catch (Exception ex) { ex.printStackTrace(); }
        // Добавляем в интерфейс изображение
        getContentPane().add(new ImageDraw(capture));
        // Открываем окно
        setVisible(true);
        try {
            // Заканчиваем работу через 10 сек
            Thread.sleep(10000);
        } catch (Exception ignored) { }
        System.exit(0);
    }
    public static void main(String[] args) {
        new SimplyJWindow();
    }
}