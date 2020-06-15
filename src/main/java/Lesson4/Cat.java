package main.java.Lesson4;

public class Cat {
    private static int counter = 0; //чтобы запрещать от такого Cat.counter = 0
    //public  static String type = "Home Cat";
    //public int age = 10;
    private int age;
    String name; // не объявлю модификатор доступа
    public String color = "red";

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
