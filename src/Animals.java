public class Animals {
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();
        Animal a1 = new Animal();

        Bird b = new Bird();
        Bird b1 = new Bird();
        b.setName("Bob");
        b.setArea("На юге");
        b.setWinterFly(false);
        b.display();
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirik_chirik();

        Fish f = new Fish();
        Fish f1 = new Fish();
        f.setName("Сельдь");
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        f.display();
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        Insect i1 = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.display();
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();

        b1.display();
        f1.display();
        i1.display();
        a1.display();
        System.out.println(a1.toString());

    }

    public static class Animal {
        private String type;
        private String name;
        private int age;
        private double weight;
        private boolean isSwim;
        private boolean isWalk;
        private boolean isFly;
        private static final String description;
        private int counter = 0;

        static {
            description = "Class Animal";
        }

        {
            name = "Unknown Animal";
            type = "Unknown";
            counter+= 1;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setSwim(boolean swim) {
            isSwim = swim;
        }

        public void setWalk(boolean walk) {
            isWalk = walk;
        }

        public void setFly(boolean fly) {
            isFly = fly;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        public boolean isSwim() {
            return isSwim;
        }

        public boolean isWalk() {
            return isWalk;
        }

        public boolean isFly() {
            return isFly;
        }

        public static String getDescription() {
            return description;
        }

        public Animal() {

        }

        public Animal(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public Animal(String type, int age) {
            this.name = "No Name";
            this.type = type;
            this.age = age;
        }

        public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
            this.type = type;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.isFly = isFly;
            this.isWalk = isWalk;
            this.isSwim = isSwim;
        }

        public String toString() {
            return "Номер: " + counter + ", Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + String.format("%.1f",
                    weight) +
                    ", Умеет летать: " + (isFly ? "Да" : "Нет") + ", Умеет ходить: " + (isWalk ? "Да" : "Нет") +
                    ", Умеет плавать: " + (isSwim ? "Да" : "Нет");
        }

        public void display() {
            System.out.println("Тип: " + type + ", Имя: " + name + ", Возраст: " + age + ", Вес: " + String.format("%.1f", weight) +
                    ", Умеет летать: " + (isFly ? "Да" : "Нет") + ", Умеет ходить: " + (isWalk ? "Да" : "Нет") +
                    ", Умеет плавать: " + (isSwim ? "Да" : "Нет"));
        }

        final public void rename(String name) {
            this.name = name;
        }

        public void holiday() {
            this.weight = this.weight + 0.1;
        }

        public void holiday(double m) {
            this.weight = this.weight + m;
        }

        public void holiday(double m, int n) {
            this.weight = this.weight + n * m;
        }
    }

    static class Bird extends Animal{
        private String area;
        private boolean winterFly;

        {
            setName("Unknown Bird");
        }

        public Bird(String type, String name) {
            super(type, name);
        }
        public Bird(String type, int age) {
            super(type, age);
        }
        public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
            super(type, name, age, weight, isFly, isWalk, isSwim);
        }

        public Bird() {
            super();
            setType("Bird");
            setFly(true);
        }

        @Override
        public void display() {
            System.out.print("I am "+getType()+". Мои уникальные свойства - Зона обитания: "+area+", Улетаю зимовать: "
                    +(winterFly?"Да":"Нет")+". ");
            super.display();
        }

        void chirik_chirik(){
            System.out.println("Chirik-Chirik");
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getArea() {
            return area;
        }

        public void setWinterFly(boolean b) {
            winterFly=b;
        }

        public boolean isWinterFly() {
            return winterFly;
        }
    }
    final static class Fish extends Animal {
        private String squama;
        private boolean upStreamSwim;

        {
            setName("Unknown Fish");
        }

        public Fish(String type, String name) {
            super(type, name);
        }

        public Fish(String type, int age) {
            super(type, age);
        }

        public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
            super(type, name, age, weight, isFly, isWalk, isSwim);
        }

        public Fish() {
            super();
            setType("Fish");
            setSwim(true);
        }

        @Override
        public void display() {
            System.out.print("I am "+getType()+". Мои уникальные свойства - Тип чешуи: "+squama+", Умение плавать против течения: "
                    +(upStreamSwim?"Да":"Нет")+". ");
            super.display();
        }

        void bul_bul() {
            System.out.println("Bul-bul");
        }

        public void setSquama(String s) {
            squama=s;
        }

        public void setUpStreamSwim(boolean b) {
            upStreamSwim=b;
        }

        public String getSquama() {
            return squama;
        }

        public boolean isUpStreamSwim() {
            return upStreamSwim;
        }
    }
    static class Insect extends Animal{
        private int wingCount;
        private boolean likeJesus;

        {
            setName("Unknown Insect");
        }

        public Insect(String type, String name) {
            super(type, name);
        }
        public Insect(String type, int age) {
            super(type, age);
        }
        public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
            super(type, name, age, weight, isFly, isWalk, isSwim);
        }

        public Insect() {
            super();
            setType("Insect");
            setWalk(true);
        }

        @Override
        public void display() {
            System.out.print("I am "+getType()+". Мои уникальные свойства - Количество крыльев: "+wingCount+", Умение ходить по воде: "
                    +(likeJesus?"Да":"Нет")+". ");
            super.display();
        }

        void ggggg(){
            System.out.println("Ggggg");
        }

        public void setWingCount(int i) {
            wingCount=i;
        }

        public void setLikeJesus(boolean b) {
            likeJesus=b;
        }

        public int getWingCount() {
            return wingCount;
        }

        public boolean isLikeJesus() {
            return likeJesus;
        }
    }
}