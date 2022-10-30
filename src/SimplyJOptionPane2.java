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
    private final String TITLE_message = "���� ���������";
    private final String TITLE_confirm = "���� �������������";
    private final String[] drink = {"���",
            "���������",
            "�������",
            "����"};

    public SimplyJOptionPane2() {
        super("������ ������������� JOptionPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ����������� ������
        UIManager.put("OptionPane.yesButtonText", "��");
        UIManager.put("OptionPane.noButtonText", "���");
        UIManager.put("OptionPane.cancelButtonText", "������");

        JPanel contents = new JPanel();
        // ������ ��� ����������� � ���� ���������
        icon = new ImageIcon("images/kitty1.png");

        // ������ ������������ ���� �� 2-� ����������
        btnMessage1 = new JButton("MessageDialog 2");
        // ������ ������������ ���� �� 4-� ����������
        btnMessage2 = new JButton("MessageDialog 4");
        btnMessage3 = new JButton("MessageDialog 5");

        // ������ ������ ��������� �������������
        btnConfirm1 = new JButton("ConfirmDialog 4+2");
        btnConfirm2 = new JButton("ConfirmDialog 5");
        btnConfirm3 = new JButton("ConfirmDialog 6");

        btnInput1 = new JButton("InputDialog 2+3");
        btnInput2 = new JButton("InputDialog 4");
        btnInput3 = new JButton("InputDialog 7");

        addMessageListeners();
        addConfirmListeners();
        addInputListeners();

        // ���������� ������ � ����������
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
        // ����� ���� �� �����
        setSize(500, 140);
        setVisible(true);
    }

    private void addMessageListeners() {
        btnMessage1.addActionListener(e -> JOptionPane.showMessageDialog(SimplyJOptionPane2.this,
                "<html><h2>�����</h2><i>� ���� �������� HTML</i>"));
        btnMessage2.addActionListener(e -> JOptionPane.showMessageDialog(SimplyJOptionPane2.this,
                new String[]{"��������� � ���� ������� ����� :",
                        " - ������ ������",
                        " - ������ ������"},
                TITLE_message, JOptionPane.ERROR_MESSAGE));
        btnMessage3.addActionListener(e -> {
            // ��������� � ��������� ������
            JOptionPane.showMessageDialog(SimplyJOptionPane2.this,
                    "������������� ����������� � ���� ���������", TITLE_message,
                    JOptionPane.INFORMATION_MESSAGE, icon);
        });
    }

    private void addConfirmListeners() {
        btnConfirm1.addActionListener(e -> {
            // ���� ������������� c 4-�� �����������
            int result = JOptionPane.showConfirmDialog(
                    SimplyJOptionPane2.this,
                    "��� ��� �����?",
                    TITLE_confirm,
                    JOptionPane.YES_NO_CANCEL_OPTION);
            // ���� ������������� c 2-�� �����������
            if (result == JOptionPane.YES_OPTION)
                JOptionPane.showConfirmDialog(SimplyJOptionPane2.this,
                        "�� �� �������������?");
            else if (result == JOptionPane.NO_OPTION)
                JOptionPane.showConfirmDialog(SimplyJOptionPane2.this,
                        "�� ����������?");
        });
        btnConfirm2.addActionListener(e -> JOptionPane.showConfirmDialog(SimplyJOptionPane2.this,
                "�� �� �������������?",
                TITLE_confirm,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE));
        btnConfirm3.addActionListener(e -> JOptionPane.showConfirmDialog(
                SimplyJOptionPane2.this, "��� �������� ������?",
                TITLE_confirm,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE, icon));
    }

    private void addInputListeners() {
        btnInput1.addActionListener(e -> {
            // ���������� ���� ����� ������ : ��������, HTML ���������
            String result = JOptionPane.showInputDialog(
                    SimplyJOptionPane2.this,
                    "<html><h2>����� ����������");
            JOptionPane.showInputDialog(
                    SimplyJOptionPane2.this,
                    "�� ��������", result);
        });
        btnInput2.addActionListener(e -> {
            // ���������� ���� ����� ������ : ��������, ��������� � ����
            // ������� �����, ��� ����������� ���� (������)
            JOptionPane.showInputDialog(SimplyJOptionPane2.this,
                    new String[]{"������� ������ ������!",
                            "��������� ������ :"},
                    "�����������",
                    JOptionPane.WARNING_MESSAGE);
        });
        btnInput3.addActionListener(e -> {
            // ���������� ���� ����� ������
            Object result = JOptionPane.showInputDialog(
                    SimplyJOptionPane2.this,
                    "�������� ������� ������� :",
                    "����� �������",
                    JOptionPane.QUESTION_MESSAGE,
                    icon, drink, drink[0]);
            // ���������� ���� ������ ���������
            JOptionPane.showMessageDialog(SimplyJOptionPane2.this, result);
        });
    }

    public static void main(String[] args) {
        new SimplyJOptionPane2();
    }
}