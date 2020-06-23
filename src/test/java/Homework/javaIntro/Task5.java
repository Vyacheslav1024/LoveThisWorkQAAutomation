package test.java.Homework.javaIntro;

public class Task5 {
    static char reversedStr[];

    public static void main(String[] args) {

        System.out.println(reversestr("Hello world!!!"));
    }

    public static String reversestr(String str) {
        int strlen = str.length();
        reversedStr = new char[strlen];

        for (int i = 0; i <= strlen / 2; i++) {
            reversedStr[i] = str.charAt(strlen - 1 - i);
            reversedStr[strlen - 1 - i] = str.charAt(i);

        }
        return new String(reversedStr);

            //Вариант №2
//            String s1 = "Hello world!!!";
//            for(int i=s1.length()-1;i>=0;i--)
//            {
//                System.out.print(s1.charAt(i));
//            }

            //Вариант №3
//            StringBuffer buffer = new StringBuffer("Hello world!!!");
//            buffer.reverse();
//            System.out.println(buffer);
        }
    }

