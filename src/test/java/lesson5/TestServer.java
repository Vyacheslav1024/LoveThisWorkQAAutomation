package test.java.lesson5;

import main.java.lesson5.app.Server;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestServer {

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
}