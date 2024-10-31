package main.java.homeworks.homework_03.task_03;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

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
        for (User user : data) {
            user.setAuthentication(false);
        }
    }

    public void logoutAllNonAdmins() {
        for (User user : data) {
            if (!user.isAdmin()) {
                user.setAuthentication(false);
            }
        }
    }
}
