package main.java.lesson5.inheritance;

public class Dog extends Animal {   // нажимаем ALT + ENTER и выбрать создать конструктор
    // который обращается к суперконструктору т.е. конструктору базового класса

    public Dog(String name) {
        //System.out.println(""); в конструкторе мы не можем вначале выполнить какую-то
        // дополнительную логику, а потом обратиться к родительскому классу
        // в конструкторе обращение к super является обязательным
        super(name);   // super означает пойди вверх к родителю
    }

    //public String getName() {   // ПОЛИМОРФИЗМ   полиморфный метод
    // у нас есть метод getName в классе Animal
    // соответственно что мы делаем, просто его переписываем
    //}

    @Override   // другим пользователям сказать, что этот метод является переопределенным
                // необходимо добавить аннотацию @Override она говорит, что метод предопределяющий

    public String getName(String name) { // необходимо поднастроить под нужную сигнатуру
        // Error необходимо посмотреть у базового класса Animal, чтобы во-первых метод именно
        // также назывался, во-вторых чтобы совпадали аргументы (тип аргумента String)
        // в данном случае мы метод getName не переопределили, а перегрузили т.е. мы взяли
        //  обычный переопределенный метод и перегрузили его дополнительным аргументом "int a"

        //super.getName();   // если мы будем обращаться к методу getName родительского класса

        System.out.println("Dog gives user it's name ");
        //return super.getName();   // необходимо вернуть наш метод
        //в методе мы можем вначале выполнить какую-то логику,  а потом обратиться к родительскому классу

        return "Overridden method name"; // вернеться строка которую переопределил
        // не обязательно обращаться к родительскому классу мы вольны делать, что хотим
    }

    @Override
    public String greet() {
        return "Hello I am a Dog";
    }
}
