package test.java.Homework.javaIntro;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(min(5,2,3));
    }

    public static int min(int a, int b, int c) {
        if(a <= b && a <= c){
            return a;
        } else if(b <= a && b <= c){
            return b;
        } else {
            return c;
        }

//    Вариант №2
//    int min = a;
//        if(a <= b && a <= c)
//    min = a;
//        else if(b <= a && b <= c)
//    min = b;
//         else
//    min = c;
//      return min;
    }
}