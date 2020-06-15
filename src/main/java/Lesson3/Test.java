package main.java.Lesson3;

import main.java.Lesson4.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.greet(); //будет ошибка если попытаемся вызвать этот метод т.к. void greet(String userName)
    }
}
