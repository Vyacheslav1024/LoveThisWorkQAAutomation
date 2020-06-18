package main.java.lesson4;

public class Cat {
    private static int counter = 0; //чтобы запрещать от такого Cat.counter = 0
    //public  static String type = "Home Cat";
    //public int age = 10;
    private int age;
    String name; // не объявлю модификатор доступа
    public final String COLOR_OF_CAT = "red"; // COLOR_OF_CAT т.к. final

    public Cat() { // constructor при перегрузки
        this("not defined");
        // this.name = "not defined"; не будет работать счетчик
    } // этот конструктор аналог Cat cat3 = new Cat("not defined");

    public Cat(String Name) { // constructor
        System.out.println("Cat was created");
        counter++;
        this.name = Name;
        this.age = 10;
    }

    public void setAge(int age) {
        // techMethod();  ИНКАПСУЛЯЦИЯ
        if (age > 1 && age < 20) { // CTRL + ALT + L
            this.age = age;
        } else {
            System.out.println("You can't set age " + age);
            this.age = 0;
        }
    }

    //private void techMethod() {  ИНКАПСУЛЯЦИЯ
    //}

    public int getAge() {

        return this.age;
    }

    void greet(String userName) {
        System.out.println("Hello user " + userName + ". My name is " + this.name);
    }
//    public Cat(String catName) {
//        System.out.println("Cat was created");
//        counter++;
//        name = catName;
//    }
    //public void initialize(String catName) {
    //  name = catName;
    //}

    public void meov() {
        System.out.println("MEOV");
    }

    public static void printCount() {
        System.out.println("Was created " + counter + " cats");
    }

}
