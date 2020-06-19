package main.java.lesson5.inheritance;

public class Invoke {   // класс необходим для того, чтобы тестировать наше добро
                        // т.е. для того, чтобы можно было создать psvm  и все
    public static void main(String[] args) {
        Cat vasiliy = new Cat("Vasiliy");
        Dog bobik = new Dog("Bobik");
        vasiliy.setName("Vasiliy2 "); // vasiliy можем сказать Vasiliy2
        System.out.println(vasiliy.getName());
        System.out.println(bobik.getName());
    }
}
