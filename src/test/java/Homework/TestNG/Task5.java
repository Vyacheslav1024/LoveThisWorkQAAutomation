package test.java.Homework.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
    }
    @DataProvider(name = "HelloWord")
    public Object[][] getData() {
        return new Object[][]{
                {"Hello Ukraine!", "!eniarkU olleH"},
                {"Hello China!", "!anihC olleH"},
                {"Hello USA!", "!ASU olleH"},

        };
    }

    @Test(dataProvider = "HelloWord")
    public void testRevertedString(String normalString, String revertedString) {
        String actualResult = reversestr(normalString);
        assertEquals(
                actualResult.toString(),
                revertedString,
                "Expected string in reverse is " + revertedString + ", but got " + actualResult);
    }
}
