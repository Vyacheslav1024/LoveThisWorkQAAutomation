package test.java.Homework.javaIntro;

public class Task2 {
        public static void main (String[]args){

            System.out.println(printName("Vyacheslav "));
        }

        public static String printName (String name){
            String matrix = "";
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    matrix += name;
                }
                matrix += "\n";
            }
            return matrix;
        }
       /* Вариант 2
        String s = "Vyacheslav ";
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(s);
            }
            System.out.println();
            }*/
}