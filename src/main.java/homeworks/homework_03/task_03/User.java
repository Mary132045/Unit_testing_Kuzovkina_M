package main.java.homeworks.homework_03.task_03;

public class User {

    private final String login;
    private final String password;
    private boolean authentication;
    private final boolean isAdmin;

    public User(String login, String password, boolean authentication, boolean isAdmin) {
        this.login = login;
        this.password = password;
        this.authentication = authentication;
        this.isAdmin = isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(boolean authentication) {
        this.authentication = authentication;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean authenticate(String login, String password) {
        if (login.equals(this.login) && password.equals(this.password)) {
            authentication = true;
        } else {
            authentication = false;
        }
        return authentication;
    }
}
