package main.java.lesson5.inheritance;

public class Animal {
    private String name;   // скопировали из класса Cat

    public Animal(String name) { // написать название конструктора в соответствии  с названием класса
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
}