package seminars.seminar_03;

import main.java.seminars.seminar_03.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void userCreationSucceeded() {
        User user = new User("QWERTY", "qwerty", false);
        Assertions.assertTrue(user.authenticate("QWERTY", "qwerty"));
    }

    @Test
    void userCreationFailed() {
        User user = new User("QWERTY", "qwerty", false);
        Assertions.assertFalse(user.authenticate("QWERTY", "ytrewq"));
    }
}
