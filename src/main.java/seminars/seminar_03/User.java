package main.java.seminars.seminar_03;

/*
Разработайте класс User с методом аутентификации по логину и паролю. Метод должен возвращать true, если введенные логин
и пароль корректны, иначе - false.
Протестируйте все методы
 */

public class User {

    private String login;
    private String password;
    private boolean authentication;

    public User(String login, String password, boolean authentication) {
        this.login = login;
        this.password = password;
        this.authentication = false;
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

    public boolean authenticate(String login, String password) {
        if (login.equals(this.login) && password.equals(this.password)) {
            authentication = true;
        } else {
            authentication = false;
        }
        return authentication;
    }
}
