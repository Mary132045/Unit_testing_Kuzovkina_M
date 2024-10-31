package seminars.seminar_05.user;

import main.java.seminars.seminar_05.user.UserRepository;
import main.java.seminars.seminar_05.user.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testGetUserName() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(1);

        assertEquals("User 1", result);
    }
}
