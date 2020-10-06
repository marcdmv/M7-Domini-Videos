package itacademy.domain;

import java.util.Date;

public class AbstractUser {
    public int id;
    public String name;
    public String surname;
    public String password;
    public Date joined;

    private static int COUNTER_USERS = 1;

    public AbstractUser (String name, String surname, String password) throws Exception {
        if (name.equals(""))
            throw new Exception("El nombre no puede estar vacío");
        if (surname.equals(""))
            throw new Exception("El apellido no puede estar vacío");
        if (password.equals(""))
            throw new Exception("Se debe definir un password");
        this.name = name;
        this.surname = surname;
        this.password = password;
        Date date = new Date();
        joined = date;
        id = COUNTER_USERS;
        COUNTER_USERS++;
    }
}
