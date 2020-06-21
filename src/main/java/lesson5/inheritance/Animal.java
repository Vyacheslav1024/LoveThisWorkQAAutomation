package main.java.lesson5.inheritance;

public abstract class Animal {
    private String name;   // скопировали из класса Cat
    //public abstract int age;   переменную нельзя сделать абстрактной

    private int age;
    public Animal(String name) { // написать название конструктора в соответствии  с названием класса
        this.age = 50;
        this.name = name;   // скопировали из класса Cat
    }

    public String getName() {   // скопировали из класса Cat
        return this.name + "!"; // в одном месте меняем реализацию т.е. не надо менять не в Cat не Dog
    }

    public String getName(String user) { // getName перегруженный
        return this.name + "! " + user;
    }

    public void setName(String name) {   // скопировали из класса Cat
        this.name = name;
    }

    public String toString() {
        return "My name is " + this.name + "and my age is " + this.age;
    }

    public boolean equals(Animal obj) {
        //return this.name == obj.name;
        return this.name.equals(obj.name); // здесь сравнивается Vasiliy из Cat vasiliy = new Cat("Vasiliy")
        // c Victor из Cat victor = new Cat("Victor");

    }

    public abstract String greet();
}