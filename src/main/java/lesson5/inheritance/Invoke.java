package main.java.lesson5.inheritance;

public class Invoke {   // класс необходим для того, чтобы тестировать наше добро
                        // т.е. для того, чтобы можно было создать psvm  и все
    public static void main(String[] args) {
        Cat vasiliy = new Cat("Vasiliy");
        Cat victor = new Cat("Victor");
        //Cat victor = vasiliy; не равные т.к. сравниваются по ссылки на адрес в памяти
        Dog bobik = new Dog("Bobik");
        //Animal animal = new Animal("Vova"); Абстрактный класс - public abstract class Animal
        //vasiliy.setName("Vasiliy2 "); // меняем имя vasiliy на Vasiliy2
        //System.out.println(vasiliy.getName());
        //System.out.println(bobik.getName());

        /*String info = vasiliy.toString();
        System.out.println(info); */// эти три записи абсолютно идентичны
        System.out.println(vasiliy); // эти три записи абсолютно идентичны - под капотом
        // вот эта штука (vasiliy) превращается вот в такую штуку (vasiliy.toString())
        /*System.out.println(vasiliy.toString());*/ // эти три записи абсолютно идентичны
        System.out.println(vasiliy.equals(victor)); // так сравнивают один объект с другим
        //System.out.println(vasiliy == victor); // так нельзя сравнивать объекты, оператор "=="
        // необходимо использовать исключительно для примитивных типов
    }
}
