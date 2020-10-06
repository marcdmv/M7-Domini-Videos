package itacademy.domain;

public class User extends AbstractUser {

    public User(String name, String surname, String password) throws Exception {
        super (name, surname, password);

    }
}
