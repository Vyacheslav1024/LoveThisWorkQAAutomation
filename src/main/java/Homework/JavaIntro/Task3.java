package main.java.Homework.JavaIntro;

public class Task3 {
    public static void main(String[] args) {
        String s = "Vyacheslav ";
        int i = 1, j;
        while (i <= 5) {
            j = 1;
            while (j <= 10) {
                System.out.print(s);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}