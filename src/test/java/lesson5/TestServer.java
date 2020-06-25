package test.java.lesson5;

import main.java.lesson5.app.Server;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestServer {

    public static void beforeMethod() {

    }

    @Test
    public void getUsersShouldReturnProperAmount() {
        Server server = new Server();
        String usersNames = server.getUsers(); // "Vova, Petya"
        int actualUsersAmount = usersNames.split(", ").length;
        int expectedUsersAmount = 2;
        //actualUsersAmount == expectedUsersAmount; мы проверяем это равенство

        assertEquals( // проверь на соответствие actual реальное значение и expected ожидаемое значение
                actualUsersAmount,
                expectedUsersAmount,
                "Expected amount of users to be " + expectedUsersAmount + " but got " + actualUsersAmount
        );
    }

    @Test
    public void getUsersShouldReturnAllNamesInUpperCase() {
        Server server = new Server();
        String[] usersNames = server.getUsers().split(", "); // {"Vova, Petya"}
        for (String name : usersNames) {
            String actualFirstChar = String.valueOf(name.charAt(0)); //v toLowerCase меняет заглавную букву на прописную
            String expectedFirstChar = String.valueOf(name.charAt(0)).toUpperCase(); // v => V
//            boolean isEqual = actualFirstChar.equals(expectedFirstChar);
//            assertTrue(isEqual); можно просто вставить
            assertTrue(
                    actualFirstChar.equals(expectedFirstChar),
                   "Expected fist char " + actualFirstChar + " in name " + name + " to be upper case."
            );
        }
    }
}