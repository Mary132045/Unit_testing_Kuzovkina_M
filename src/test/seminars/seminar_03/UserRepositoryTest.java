package seminars.seminar_03;

import main.java.seminars.seminar_03.User;
import main.java.seminars.seminar_03.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    @Test
    void userRepositoryAuthenticated() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("QWERTY", "qwerty", false);
        userRepository.addUser(userNA);
        Assertions.assertFalse(userRepository.findByName(userNA.getLogin()));
    }

    @Test
    void userRepositoryNotAuthenticated() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("QWERTY", "qwerty", false);
        userNA.authenticate("QWERTY", "ytrewq");
        userRepository.addUser(userNA);
        Assertions.assertFalse(userRepository.findByName(userNA.getLogin()));
    }
}
