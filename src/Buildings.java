import java.io.*;

public class Buildings {
    public static void main(String[] args) {

        Building b = new Building("Просто дом", "Просто улица", "01.01.22", "Иванов", true);
        Library l = new Library("Библиотека", "Вторая улица", "02.02.22",
                "Петров", false, 1000, 10, "Москва");
        System.out.println(b.toString());
        System.out.println(l.toString());
        try {
            FileWriter writer = new FileWriter("output.txt", false);
            writer.write(b.toString());
            writer.append('\n');
            writer.append(l.toString());
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static class Building {
        private String name;
        private String adress;
        private String data;
        private String archName;
        private boolean culture;

        public void setName(String name) {
            this.name = name;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public void setData(String data) {
            this.data = data;
        }

        public void setArchName(String archName) {
            this.archName = archName;
        }

        public void setCulture(boolean culture) {
            this.culture = culture;
        }

        public String getName() {
            return name;
        }

        public String getAdress() {
            return adress;
        }

        public String getData() {
            return data;
        }

        public String getArchName() {
            return archName;
        }

        public boolean isCulture() {
            return culture;
        }

        public Building() {

        }

        public Building(String name, String adress, String data, String archName, boolean culture) {
            this.name = name;
            this.adress = adress;
            this.data = data;
            this.archName = archName;
            this.culture = culture;
        }

        public void rename(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("Атрибуты Building: Имя " + name + " , Адрес " + adress + " , Год постройки " + data + " , " +
                    "Имя архитектора" + archName + " , Культурный памятник? " + (culture ? "Да." : "Нет."));
        }

        public void buildinfo() {
            System.out.println("Год постройки " + data + " , Имя архитектора " + archName);
        }

        public String toString(){
            return "Атрибуты Building: Имя " + name + " , Адрес " + adress + " , Год постройки " + data + " , Имя архитектора"
                    + archName + " , Культурный памятник? " + (culture ? "Да." : "Нет.");
        }
    }
    public static final class Library extends Building {
        private int booksCount;
        private int workers;
        private String area;

        public Library(String name, String adress, String data, String archName, boolean culture, int booksCount, int workers,
                       String area) {
            super(name, adress, data,archName,culture);
            this.booksCount = booksCount;
            this.workers = workers;
            this.area = area;
        }

        public void setBooksCount(int booksCount) {
            this.booksCount = booksCount;
        }

        public void setWorkers(int workers) {
            this.workers = workers;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public int getBooksCount() {
            return booksCount;
        }

        public int getWorkers() {
            return workers;
        }

        public String getArea() {
            return area;
        }

        public String toString(){
            return super.toString() + " Аттрибуты класса: Количество книг " + booksCount + " , Число рабочих "
                    + workers + " , Район " + area;
        }
    }
    public static final class House extends Building {
        private int rooms;
        private int peoples;
        private int floors;

        public void setRooms(int rooms) {
            this.rooms = rooms;
        }

        public void setPeoples(int peoples) {
            this.peoples = peoples;
        }

        public void setFloor(int floors) {
            this.floors = floors;
        }

        public int getRooms() {
            return rooms;
        }

        public int getPeoples() {
            return peoples;
        }

        public int getFloor() {
            return floors;
        }

        public String toString(){
            return super.toString() + " Аттрибуты класса: Количество комнат " + rooms + " , Число жителей "
                    + peoples + " , Количество этажей " + floors;
        }
    }
    public static final class PoliceDepartment extends Building {
        private int cars;
        private int workers;
        private String department;

        public void setCars(int cars) {
            this.cars = cars;
        }

        public void setWorkers(int workers) {
            this.workers = workers;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public int getCars() {
            return cars;
        }

        public int getWorkers() {
            return workers;
        }

        public String getDepartment() {
            return department;
        }

        public String toString(){
            return super.toString() + " Аттрибуты класса: Количество машин " + cars + " , Число сотрудников "
                    + workers + " , Департамент " + department;
        }
    }
    public static final class University extends Building {
        private int students;
        private String direction;
        private String area;

        public void setStudents(int students) {
            this.students = students;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public int getStudents() {
            return students;
        }

        public String getDirection() {
            return direction;
        }

        public String getArea() {
            return area;
        }

        public String toString(){
            return super.toString() + " Аттрибуты класса: Количество студентов " + students + " , Направление "
                    + direction + " , Район " + area;
        }
    }
    public static final class ShoppingCenter extends Building {
        private int space;
        private int shops;
        private String area;

        public void setSpace(int space) {
            this.space = space;
        }

        public void setShops(int shops) {
            this.shops = shops;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public int getSpace() {
            return space;
        }

        public int getShops() {
            return shops;
        }

        public String getArea() {
            return area;
        }

        public String toString(){
            return super.toString() + " Аттрибуты класса: Площадь " + space + " , Количество магазинов "
                    + shops + " , Район " + area;
        }
    }
    public static final class HighRiseBuilding extends Building {
        private int floors;
        private int peoples;
        private String area;

        public void setFloors(int floors) {
            this.floors = floors;
        }

        public void setPeoples(int peoples) {
            this.peoples = peoples;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public int getFloors() {
            return floors;
        }

        public int getPeoples() {
            return peoples;
        }

        public String getArea() {
            return area;
        }

        public String toString(){
            return super.toString() + " Аттрибуты класса: Количество этажей " + floors + " , Количество людей "
                    + peoples + " , Район " + area;
        }
    }
}
