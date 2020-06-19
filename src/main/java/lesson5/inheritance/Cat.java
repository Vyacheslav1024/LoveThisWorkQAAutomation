package main.java.lesson5.inheritance;

public class Cat extends Animal {   // чтобы наследоваться от базового класса написать extends
    //  и название класса от которого мы наследуемся Animal
    public Cat(String name) {   // конструкторы необходимо ручками переопределить
        super(name);   // вызови пожалуйста конструктор базового класса
    }
    //private String name;   // у класса Cat есть приватное свойство name оно будет
    // задавать конструктором

    //public Cat(String name) {   // личный конструктор Cat в него будет попадать String name
    //this.name = name;   // для того, чтобы установить значение name, заранее определяем имя
    //}

    //public String getName() {   // для метода String name можно добавить публичный геттер
    // для имени getName, он будет возвращять String
    //return this.name;   // можно сократить return name; под капотом компилятор подставит this
    //}

    //public void setName(String name) {
    //this.name = name;   // здесь мы можем переопределить имя при желании
    //}
}
