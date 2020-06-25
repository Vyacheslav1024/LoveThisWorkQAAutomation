package test.java.Homework.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1 {

        public static void main(String[] args) {
            System.out.println(min(5, 2, 3));
        }

        public static int min(int a, int b, int c) {
            if (a <= b && a <= c) {
                return a;
            } else if (b <= a && b <= c) {
                return b;
            } else {
                return c;
            }

    }
    @DataProvider(name = "numerals")
    public Object[][] getData() {
        return new Object[][]{
                {5, 2, 3, 2},
                {-1, 5, 10, -1},
                {30, 50, 80, 30},
        };
    }

    @Test(dataProvider = "numerals")
    public void testMinNumber ( int number1, int number2, int number3, int expectedMinimum){
        int actualMinimum = min(number1, number2, number3);
        assertEquals(
                actualMinimum,
                expectedMinimum,
                "Expected minimum number is " + expectedMinimum + ", but got " + actualMinimum);
    }
}
