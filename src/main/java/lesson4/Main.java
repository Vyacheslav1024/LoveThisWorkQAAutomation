package main.java.lesson4;

public class Main {
    public static void main(String[] args) {
//        Cat vasiliy = new Cat();
//        Cat victor = new Cat();
//        Cat petr = victor;
//        petr.age = 100;
//
//        System.out.println("Vasiliy age is " + vasiliy.age);
//        System.out.println("Petr age is " + petr.age);
//        vasiliy.meov();
//        System.out.println("Was created " + Cat.counter);
//        Cat.printCount();
        //System.out.println(vasiliy.equals(victor)); false
        //System.out.println(vasiliy == victor); false
        // Dog bobik = new Dog();
        //int age = vasiliy.age;
        Cat cat1 = new Cat("Vasiliy"); // constructor
        Cat cat2 = new Cat("Victor");
        Cat cat3 = new Cat(); // перегрузка конструктора
        //Cat cat3 = new Cat("not defined"); // перегрузка конструктора
        cat1.name = "Petr";
        System.out.println("First cat " + cat1.name);
        System.out.println("Second cat " + cat2.name);
       // cat1.initialize("Vasiliy");
        cat2.greet("Vova");
        cat3.greet("Vova");
        cat1.setAge(-10);
        //cat1.color = "fgfgh" Error т.к. public final String color = "red";
        System.out.println(cat1.getAge());
        //Cat.counter = 0; напишет, что мы создали 0 экземпляров
        //System.out.println(Cat.counter);
        //cat1.age = 50; нельзя поменять age т.к. private int age
    }
}
