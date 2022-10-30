public class Materials {
    public static void main(String[] args) {
        WritingMaterials wm = new WritingMaterials("�����", "�������", 145, 15.6, true);
        wm.display();

        Pen p = new Pen();
        p.setName("������");
        p.setColor("�������� ����������");
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.display();
        p.writeMyName();

        System.out.println();

        Ruler r = new Ruler();
        r.setName("�������");
        r.setPrice(125);
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.display();
        r.measure();

        System.out.println();

        Divider d = new Divider();
        d.setName("�������");
        d.setDividerType("� ����������");
        d.setMetal(true);
        d.setDraw(true);
        d.setPrice(320);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.display();
        d.drawCircle();
    }


    public static class WritingMaterials {
        private String name;
        private String color;
        private int price;
        private double length;
        private boolean draw;
        private static final String description;
        private static int counter = 0;

        static {
            description = "Class WritingMaterials";
        }

        {
            name = "���������� ��������������";
            color = "Unknown";
            counter += 1;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public boolean isDraw() {
            return draw;
        }

        public void setDraw(boolean b) {
            this.draw = b;
        }

        public static String getDescription() {
            return description;
        }

        public WritingMaterials() {
        }

        public WritingMaterials(String name, String color, int price, double length, boolean draw) {
            this.name = name;
            this.color = color;
            this.price = price;
            this.length = length;
            this.draw = draw;
        }

        public String toString() {
            return "�����: " + counter + ", ��������: " + name + " ����: " + color + " �����: " + length + " ����: " + price
                    + " ����� ��������: " + (draw ? "��" : "���");
        }

        public void display() {
            System.out.println("��������: " + name + " ����: " + color + " �����: " + length + " ����: " + price
                    + " ����� ��������: " + (draw ? "��" : "���"));
        }

        public void replaceRod(String c) {
            this.color = c;
        }

        public int priceUp(int n) {
            this.price = price + n;
            return price;
        }

        public int priceDown(int n) {
            this.price = price - n;
            return price;
        }

        public void draw() {
            if (draw)
                System.out.println(name + " ����� �����: 1. �� ���� - " + color);
            else
                System.out.println(name + " �� ����� ������ ����������");
        }

        public void draw(int n) {
            if (draw)
                System.out.println(name + " ����� �����: " + n + ". �� ���� - " + color);
            else
                System.out.println(name + " �� ����� ������ ����������");
        }

        public void draw(String color) {
            if (draw)
                System.out.println(name + " ����� �����: 1. �� ���� - " + color);
            else
                System.out.println(name + " �� ����� ������ ����������");
        }

        public void draw(String color, int n) {
            if (draw)
                System.out.println(name + " ����� �����: " + n + ". �� ���� - " + color);
            else
                System.out.println(name + " �� ����� ������ ����������");
        }

    }

    public static class Pen extends WritingMaterials {
        private int countColor;
        private boolean auto;

        {
            setName("�����");
            setColor("Unknown");
            setDraw(true);
        }

        void writeMyName() {
            System.out.println("Name");
        }

        @Override
        public void display() {
            System.out.println("This is " + getClass().getSimpleName() + " ��������: " + getName() + ". ����: " + getColor() + ". " +
                    "����� ��������: " + (auto ? "��." : "���."));
        }

        public int getCountColor() {
            return countColor;
        }

        public void setCountColor(int n) {
            this.countColor = n;
        }

        public boolean isAuto() {
            return auto;
        }

        public void setAuto(boolean b) {
            this.auto = b;
        }
    }

    public static final class Ruler extends WritingMaterials {
        private double length;
        private boolean wood;

        {
            setName("�������");
            setColor("Unknown");
            setDraw(false);
        }

        public double getLength() {
            return length;
        }

        public void setLength(double d) {
            this.length = d;
        }

        public boolean isWood() {
            return wood;
        }

        public void setWood(boolean b) {
            this.wood = b;
        }

        @Override
        public void display() {
            System.out.println("This is " + getClass().getSimpleName() + " ��������: " + getName() + ". ����: " + getPrice() +
                    ". ����� �������: " + length + " ��� �� ������?: " + (wood ? "��" : "���"));
        }

        void measure() {
            System.out.println("������ ������� �����!");
        }
    }

    public static class Divider extends WritingMaterials {
        private String dividerType;
        private boolean metal;

        {
            setName("�������");
            setColor("Unknown");
            setDraw(true);
        }

        public String getDividerType() {
            return dividerType;
        }

        public void setDividerType(String s) {
            this.dividerType = s;
        }

        public boolean isMetal() {
            return metal;
        }

        public void setMetal(boolean b) {
            this.metal = b;
        }

        @Override
        public void display() {
            System.out.println("This is " + getClass().getSimpleName() + " ��������: " + getName() + ". ���: " + dividerType +
                    ". ��� �� ������?: " + (metal ? "��" : "���") + ". �� ����� ��������? " + (isDraw() ? "��" : "���") + ". ����: "
                    + getPrice());
        }

        final void drawCircle() {
            System.out.println("�������� ����!");
        }
    }
}