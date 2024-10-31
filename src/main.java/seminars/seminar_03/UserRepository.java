package main.java.seminars.seminar_03;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.getAuthentication()) {
            data.add(user);
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getLogin().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAll() {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).setAuthentication(false);
        }
    }
}
