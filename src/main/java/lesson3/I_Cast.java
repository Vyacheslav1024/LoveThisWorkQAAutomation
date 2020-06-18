package main.java.lesson3;

public class I_Cast {
    public static void main(String[] args) {
        int x = 2;
        int w = 3;
        System.out.println(x/w); // 0,66666
        int a = 10;
        int a1 = 22;
        long b = 21474836479L;
        int c = (int)b;
        /*System.out.println(c);
        System.out.println((float) 5/3); // 5.0
        System.out.println((float) 5/(float) 3);
        System.out.println(5/(float) 3);
        System.out.println(5.0/3);*/
        System.out.println((double) 5/3);
        System.out.println((float) a/b);
    }
}
