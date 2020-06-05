package main.java.Lesson3;

public class L_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] b = {10, 20, 30};
        //int b[] = {10, 20, 30};
        int[] c = new int[5];
        char[] d = {'c', 's'};
        String[] str = {"Hello", "world"};

        int[] arr = {2, 4, 6, 8};
        //System.out.println(arr[0]);
        arr[0] = 10;
        //System.out.println(arr[0]);
        //System.out.println(arr.length - 1);
        System.out.println(arr[arr.length - 1]);
    }
}
