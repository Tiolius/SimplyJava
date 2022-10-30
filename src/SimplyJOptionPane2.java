import javax.swing.*;

public class SimplyJOptionPane2 extends JFrame {
    private final JButton btnMessage1;
    private final JButton btnMessage2;
    private final JButton btnMessage3;

    private final JButton btnConfirm1;
    private final JButton btnConfirm2;
    private final JButton btnConfirm3;

    private final JButton btnInput1;
    private final JButton btnInput2;
    private final JButton btnInput3;

    private final ImageIcon icon;
    private final String TITLE_message = "Окно сообщения";
    private final String TITLE_confirm = "Окно подтверждения";
    private final String[] drink = {"Сок",
            "Минералка",
            "Лимонад",
            "Пиво"};

    public SimplyJOptionPane2() {
        super("Пример использования JOptionPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Локализация кнопок
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        UIManager.put("OptionPane.cancelButtonText", "Отмена");

        JPanel contents = new JPanel();
        // Иконка для отображения в окне сообщений
        icon = new ImageIcon("images/kitty1.png");

        // Кнопка формирования окна по 2-м параметрам
        btnMessage1 = new JButton("MessageDialog 2");
        // Кнопка формирования окна по 4-м параметрам
        btnMessage2 = new JButton("MessageDialog 4");
        btnMessage3 = new JButton("MessageDialog 5");

        // Кнопки вывода сообщений подтверждения
        btnConfirm1 = new JButton("ConfirmDialog 4+2");
        btnConfirm2 = new JButton("ConfirmDialog 5");
        btnConfirm3 = new JButton("ConfirmDialog 6");

        btnInput1 = new JButton("InputDialog 2+3");
        btnInput2 = new JButton("InputDialog 4");
        btnInput3 = new JButton("InputDialog 7");

        addMessageListeners();
        addConfirmListeners();
        addInputListeners();

        // Размещение кнопок в интерфейсе
        contents.add(btnMessage1);
        contents.add(btnMessage2);
        contents.add(btnMessage3);

        contents.add(btnConfirm1);
        contents.add(btnConfirm2);
        contents.add(btnConfirm3);

        contents.add(btnInput1);
        contents.add(btnInput2);
        contents.add(btnInput3);

        setContentPane(contents);
        // Вывод окна на экран
        setSize(500, 140);
        setVisible(true);
    }

    private void addMessageListeners() {
        btnMessage1.addActionListener(e -> JOptionPane.showMessageDialog(SimplyJOptionPane2.this,
                "<html><h2>Текст</h2><i>в виде разметки HTML</i>"));
        btnMessage2.addActionListener(e -> JOptionPane.showMessageDialog(SimplyJOptionPane2.this,
                new String[]{"Сообщение в виде массива строк :",
                        " - первая строка",
                        " - вторая строка"},
                TITLE_message, JOptionPane.ERROR_MESSAGE));
        btnMessage3.addActionListener(e -> {
            // Включение в интерфейс иконки
            JOptionPane.showMessageDialog(SimplyJOptionPane2.this,
                    "Использование изображения в окне сообщений", TITLE_message,
                    JOptionPane.INFORMATION_MESSAGE, icon);
        });
    }

    private void addConfirmListeners() {
        btnConfirm1.addActionListener(e -> {
            // Окно подтверждения c 4-мя параметрами
            int result = JOptionPane.showConfirmDialog(
                    SimplyJOptionPane2.this,
                    "Вам это нужно?",
                    TITLE_confirm,
                    JOptionPane.YES_NO_CANCEL_OPTION);
            // Окна подтверждения c 2-мя параметрами
            if (result == JOptionPane.YES_OPTION)
                JOptionPane.showConfirmDialog(SimplyJOptionPane2.this,
                        "Вы не отказываетесь?");
            else if (result == JOptionPane.NO_OPTION)
                JOptionPane.showConfirmDialog(SimplyJOptionPane2.this,
                        "Вы отказались?");
        });
        btnConfirm2.addActionListener(e -> JOptionPane.showConfirmDialog(SimplyJOptionPane2.this,
                "Вы не отказываетесь?",
                TITLE_confirm,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE));
        btnConfirm3.addActionListener(e -> JOptionPane.showConfirmDialog(
                SimplyJOptionPane2.this, "Вам нравится значок?",
                TITLE_confirm,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE, icon));
    }

    private void addInputListeners() {
        btnInput1.addActionListener(e -> {
            // Диалоговое окно ввода данных : родитель, HTML сообщение
            String result = JOptionPane.showInputDialog(
                    SimplyJOptionPane2.this,
                    "<html><h2>Добро пожаловать");
            JOptionPane.showInputDialog(
                    SimplyJOptionPane2.this,
                    "Вы ответили", result);
        });
        btnInput2.addActionListener(e -> {
            // Диалоговое окно ввода данных : родитель, сообщение в виде
            // массива строк, тип диалогового окна (иконки)
            JOptionPane.showInputDialog(SimplyJOptionPane2.this,
                    new String[]{"Неверно введен пароль!",
                            "Повторите пароль :"},
                    "Авторизация",
                    JOptionPane.WARNING_MESSAGE);
        });
        btnInput3.addActionListener(e -> {
            // Диалоговое окно ввода данных
            Object result = JOptionPane.showInputDialog(
                    SimplyJOptionPane2.this,
                    "Выберите любимый напиток :",
                    "Выбор напитка",
                    JOptionPane.QUESTION_MESSAGE,
                    icon, drink, drink[0]);
            // Диалоговое окно вывода сообщения
            JOptionPane.showMessageDialog(SimplyJOptionPane2.this, result);
        });
    }

    public static void main(String[] args) {
        new SimplyJOptionPane2();
    }
}