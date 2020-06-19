package main.java.Homework.JavaIntro;

public class Task4 {
        public static void main( String[] args ){
        int x = 1;
        int y = 0;
        do {
            System.out.print("Vyacheslav ");
            x++;
            y++;
            if(y >= 10) {
                System.out.println();
                y = 0;
            }
        }while(x <= 50);
    }
}