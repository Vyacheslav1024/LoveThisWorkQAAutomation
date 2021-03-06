package test.java.Homework.TestNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        System.out.println(printName("Vyacheslav "));
    }

    public static String printName(String name) {
        String matrix = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                matrix += name;
            }
            matrix += "\n";
        }
        return matrix;
    }

    @Parameters({"name"})
    @Test
    public void verifyNumberOfNames(@Optional("Vyacheslav ") String name){
        int expectedNamesCount = 50;
        String output = printName(name);
        output = output.replaceAll("\n", "");
        String[] names = output.split("\\s+");
        System.out.println(Arrays.toString(names));
        Assert.assertTrue(expectedNamesCount == names.length,
                "Expected number of names " + expectedNamesCount + " but got " + names.length);
    }
}



